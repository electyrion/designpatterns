# Tuesday March 7, 2023

## Singleton

- Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance [source](https://refactoring.guru/design-patterns/singleton)

## Intent

Ensure a class only has one instance, and provide a global point of access to it.

## Example

- We have a `Logger` class that has a `log` method that logs a message to the console and a `getInstance` method that returns a `Logger` object [source](https://refactoring.guru/design-patterns/singleton/java/example)
- The `getInstance` method is the global access point to the `Logger` object and the `Logger` class is the singleton class that ensures that only one instance of the `Logger` class exists at any given time in the program execution [source](https://refactoring.guru/design-patterns/singleton/java/example)

## Applicability

Use the Singleton pattern when:

- there must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
- when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code.
- when you need to control the number of instances of a class, and you want to prevent any other code from creating additional instances.
- when you want to reduce the number of global variables in your program.
- when you want to reduce the number of operations and/or memory accesses needed to get to the instance

## Pros and Cons

### Pros

- You can be sure that a class has only a single instance.
- You gain a global access point to that instance.
- The singleton object is initialized only when it's requested for the first time.

### Cons

- The pattern requires special treatment in a multithreaded environment so that multiple threads won't create a singleton object several times.
- The pattern may be violated if the code isn't careful with multithreaded programming.
- The pattern can mask bad design, for instance, when the components of the program know too much about each other.

## Relations with Other Patterns

- You can implement the Singleton pattern with the Factory Method pattern, but it's not the only way to do it. The Factory Method pattern lets you defer the choice of the class to instantiate to the subclass. The Singleton pattern doesn't provide such flexibility, as the class of the singleton object is hardcoded into the method that creates it.
