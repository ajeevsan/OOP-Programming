// Encapsulation
class BankAccount {
    #balance = 0;
    deposit(amt: number) {
        if(amt <=0) throw new Error("Invalid amount");
        this.#balance += amt;
    }
    get balance() { return this.#balance; } //read only access
}

// Abstraction 
interface PaymentMethod { pay(amount: number): Promise<void> }

// Inheritance
// Common parent class for payments
abstract class BasePayment implements PaymentMethod {
    constructor(protected methodName: string) {}
    protected validateAmount(amount: number): void {
        if(amount<=0) {
            throw new Error("Payment amount must be positive");
        }
    }
    abstract pay(amount: number): Promise<void>;
}

// child class 1
class CardPayment extends BasePayment {
    constructor() {
        super("Credit/Debit Card");
    }

    async pay(amount: number): Promise<void> {
        this.validateAmount(amount);

        console.log(`${this.methodName}: Processing payment of Rs${amount}`);
        console.log("Card Payment successful!");
    }
}

// Child calss 2
class UPIPayment extends BasePayment {
    constructor() {
        super("UPI");
    }

    async pay(amount: number): Promise<void> {
        this.validateAmount(amount);

        console.log(`${this.methodName}: Processing the payment of Rs${amount}`);
        console.log("UPI Payment Successful!")
    }
}

// Polymorphism
async function checkout(m: PaymentMethod, total: number): Promise<void> {
    console.log(`\nCheckout started: Rs${total}`);

    await m.pay(total);
    console.log("Checkout completed!");
}

// Run the program
async function main(): Promise<void> {

    console.log("=== Encapsulation ===");
    const account = new BankAccount();
    account.deposit(5000);
    console.log("Account balance: ", account.balance);

    console.log("\n=== Inheritance ===");
    const card = new CardPayment();
    const upi = new UPIPayment();
    console.log("Created CardPayment and UPIPayment");

    console.log("\n=== Polymorphism ===");
    await checkout(card, 1500);
    await checkout(upi, 750);
}

main().catch((error: unknown) => {
    console.error("Error: ", error);
})