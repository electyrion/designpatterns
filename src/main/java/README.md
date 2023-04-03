# Key Note

## Design Principle

- Program to an interface, not an implementation
- High Cohesion
- Low Coupling
- Open - Closed Principle
- Separation of Concerns

## Element of Design Pattern

### Problem

- Describe when to apply the pattern
- Answer -- what is the pattern trying to solve

### Solution

- Describe elements, relationships, responsibilities, and collaborations which make up the design

### Consequences

- Result of applying the pattern
- Benefits and trade-offs
- Subjective depending on the concrete scenarios

## Design Pattern Classification

- Creational
- Structural
- Behavioral

## Some Pattern Come With Negative Consequences

Object poliferation, performance hits, additional layers

### SOLID Design Principle

Solid is an acronym that stands for five design principles that can be used to guide software development to create more maintainable, flexible and scalable code. The five principles of SOLID design are:

- Single Responsibility Principle `(SRP)`: This principle states that a class `should have only one responsibility`, meaning that it should have `only one reason to change`. This helps to keep the code `modular` and easier to maintain.

- Open-Closed Principle `(OCP)`: This principle states that a class should be `open for extension but closed for modification`. This means that you can `add` new features or behaviors to a class `without changing` its existing code.

- Liskov Substitution Principle `(LSP)`: This principle states that objects of a superclass should be able to be `replaced` with objects of a subclass without affecting the correctness of the program. This helps to ensure that the code is flexible and can be `easily modified` without breaking other parts of the system.

- Interface Segregation Principle (ISP): This principle states that a client should not be forced to depend on methods it does not use. This means that interfaces should be designed to be as small and specific as possible, so that clients can implement only the methods they need.

- Dependency Inversion Principle (DIP): This principle states that high-level modules should not depend on low-level modules, but instead, they should depend on abstractions. This helps to ensure that the code is decoupled and can be easily modified without affecting other parts of the system.
