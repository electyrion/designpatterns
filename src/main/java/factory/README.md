# Tuesday 7 March

## Factory

Think of a car manufacturer that produces `several different models` of cars. Each model might have different features, such as different engines, colors, and options. However, all of the cars are `manufactured using a similar set of processes and techniques`. The car manufacturer might use an abstract factory to manage the manufacturing process for all of their different car models.

In software development, the abstract factory pattern works in a similar way. Imagine you're building a software application that needs to `create different types` of objects. Each object might have different properties or methods, but they all need to be `created using a similar set of processes and techniques`. An abstract factory provides a way to `manage the creation` process for all of these different objects.

For example, imagine you're building a game that needs to create different types of characters, such as warriors, mages, and archers. Each type of character might have different abilities and equipment, but they all need to be `created` using a `similar` set of `processes` and `techniques`. An abstract factory provides a way to `manage the creation process` for all of these different character types.

So, in short, the abstract factory pattern is a way of `managing the creation process for different types of objects` in a software application. Just like a car manufacturer might use an abstract factory to manage the manufacturing process for different car models, a software application might use an abstract factory to manage the creation process for different types of objects.

- Factory is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created
- Factory method lets a class defer instantiation to subclasses [source](https://refactoring.guru/design-patterns/factory-method)

### Example

- We have a `Vehicle` interface and a `Car` class that implements the `Vehicle` interface and a `VehicleFactory` class that has a `createVehicle` method that returns a `Vehicle` object and a `CarFactory` class that extends the `VehicleFactory` class and overrides the `createVehicle` method to return a `Car` object instead of a `Vehicle` object [source](https://refactoring.guru/design-patterns/factory-method/java/example)
- The `VehicleFactory` class is the factory class and the `CarFactory` class is the concrete factory class

### UML

![Factory UML](https://refactoring.guru/images/patterns/diagrams/factory-method/structure-2x.png)
