# Tuesday 7 March

## Factory

- Factory is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created
- Factory method lets a class defer instantiation to subclasses [source](https://refactoring.guru/design-patterns/factory-method)

### Example

- We have a `Vehicle` interface and a `Car` class that implements the `Vehicle` interface and a `VehicleFactory` class that has a `createVehicle` method that returns a `Vehicle` object and a `CarFactory` class that extends the `VehicleFactory` class and overrides the `createVehicle` method to return a `Car` object instead of a `Vehicle` object [source](https://refactoring.guru/design-patterns/factory-method/java/example)
- The `VehicleFactory` class is the factory class and the `CarFactory` class is the concrete factory class

### UML

![Factory UML](https://refactoring.guru/images/patterns/diagrams/factory-method/structure-2x.png)
