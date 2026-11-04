# Bullet Points
- Classes define what an object knows and what an objecta does.
- Things an object does are its methods (behavior).
- Methods can use instance variables so that objects of the same type can behvave differently.
- A method can have parameters, which means you can pass one or more values in to the method.
- The number and type of values you pass in must mathc the order and type of parameters decalred by the method.
- Values passed in and out of methods can be implicitly promoted to a larder type or explicitly cast to a smaller type.
- The value you pass as an argument to a method can be a literal value (2, 'c', etc.) or a variable of the declared parameter taype (for example, x where x is an int variable). There are other things you can pass as arguments, but we're not there yet.
- A method must declare a return type. A void return type means the method doesn't return anything.
- A method must declare a non-void return type, in must return a value compatible with the declared return type.

# Bullet Points
- Encapsulation gives you control over who changes the data in your class and how.
- Make an instance variable private so it can't be changed by accessing the variable directly.
- Create a public mutator method, e.g. a setter to control how other code interacts with your data. For example, you can add validation code inside a setter to make sure the values isn't changed to something invalid.
- Instance variables are assingned values by default, even if you don't set them explicitly.
- Local variables e.g variables inside methods are not assigned a value by default. You always need to initialize them.
- Use == to check if two primitives are the same value.
- Use == to check if two references are the same, i.e two object variables are actually athe same object.
- Use .equals() to see if two objects are equivalent e.g to check if two String values contain the same characters.