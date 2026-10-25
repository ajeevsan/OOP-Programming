class Animal {
    #id = Math.random();
    constructor(public name: string) {}
    speak() { return `${this.name} makes a sound`; }
    static create(n: string) { return new Animal(n); }
}   

class Dog extends Animal {
    speak() { return `${super.speak()} - woof`; }
}

const d = new Dog("Rex");
Object.getPrototypeOf(d) === Dog.prototype;                          // true
Object.getPrototypeOf(Dog.prototype) === Animal.prototype;           // true
Object.hasOwn(d, "speak");                                           // false (on prototype)
Object.hasOwn(d, "name");                                            // true  (own property)