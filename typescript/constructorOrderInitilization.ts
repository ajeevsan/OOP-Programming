class Base {
    constructor() { this.init(); }
    init() {}
}

class Child extends Base {
    value = 10;
    init() { console.log(this.value); }
}

new Child();