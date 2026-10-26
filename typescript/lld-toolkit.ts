// pattern 1: Strategy(replace if/else on type)
interface PricingStrategy { price(base: number): number }

class RegularPricing implements PricingStrategy { price(b: number) { return b; }}
class SurgePricing implements PricingStrategy {
    constructor(private readonly multiplier: number) {}
    price(b: number) { return b * this.multiplier; }
}

class Ride {
    constructor(private readonly base: number, private strategy: PricingStrategy) {}
    setStrategy(s: PricingStrategy) { this.strategy = s; }
    fare() { return this.strategy.price(this.base); }
}

// pattern 2: observer (typed events)
interface Observer<T> { update(event: T): void }

class Subject<T> {
    private observers = new Set<Observer<T>>();
    subscribe(o: Observer<T>) { this.observers.add(o); return () => this.observers.delete(o); }
    emit(e: T) { this.observers.forEach(o => o.update(e)); }
}

//pattern 3: factory
type VehicleType = "car" | "bike";

class VehicleFactory {
  static create(type: VehicleType): Vehicle {
    switch (type) {
      case "car":  return new Car();
      case "bike": return new Bike();
      default: { const _x: never = type; throw new Error(`Unknown ${_x}`); } // exhaustive
    }
  }
}

// pattern 4: builder(fluent, with this return)
class QueryBuilder {
    private parts: string[] = [];
    select(f: string) { this.parts.push(`Select ${f}`); return this;}
    from(t: string) { this.parts.push(`From ${t}`); return this;}
    build() { return this.parts.join(" "); }
}

// pattern 5: singleton(and why nest makes it unnecessary)
class Cofig {
    private static instance?: Config;
    private constructor() {}
    static get(): config { return (Config.instance ??= new Config()); }
}

// pattern 6: state(discriminated union alternative)
type OrderState = | { kind: "created"} | {kind: "paid", paidAt: Date} | { kind: "shipped"; trackingId: string };
function next(s: OrderState): OrderState {
    switch(s.kind){
        case "created": return { kind: "paid", paidAt: new Date()};
        case "paid": return { kind: "shipped", trackingId: "T1 "};
        case "shipped":: return s;
    }
}

// pattern 7: Dependency Injection by hand
interface OrderRepo { save(o: Order): Promise<void> }
interface Notifier  { send(to: string, msg: string): Promise<void> }

class OrderService {
  constructor(private readonly repo: OrderRepo, private readonly notifier: Notifier) {}
  async place(o: Order) { await this.repo.save(o); await this.notifier.send(o.userId, "Placed"); }
}

// Composition root: wiring happens in exactly one place
const service = new OrderService(new MongoOrderRepo(), new EmailNotifier());