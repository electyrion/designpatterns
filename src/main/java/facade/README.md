# Tuesday 28 February 2023

## Facade

Think of a building's facade as the exterior that people see from the street. The facade can be very complex, with lots of intricate details and different materials used. However, for someone walking by on the street, they only see the front of the building and don't need to know all the details about how the building is constructed.

In software development, the facade pattern works in a similar way. A software application might have many `different components` that `work together` to make the application function, and `each component` might have its own `complex set of rules and processes`. The facade pattern provides a `simplified interface` that hides all of the complex inner workings of the application, making it easier for developers to work with and for users to interact with.

Imagine a music player application that has a lot of different functions, such as playing music, creating playlists, and searching for songs. Each of these functions might have its own set of rules and processes that make it work. However, a user of the application doesn't need to know all of those details - they just want to be able to select a song and listen to it. The facade pattern provides a simplified interface that allows the user to do just that, `without needing to understand all of the underlying processes`.

So, in short, the facade design pattern is a way of `simplifying complex software` applications by `providing a simplified interface` that hides all of the complex inner workings. Just like the facade of a building, the facade pattern allows users to interact with the application without needing to understand all of the details about how it works.

- Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes
- Facade defines a higher-level interface that makes the subsystem easier to use
- Think of it as a building's facade: it presents a simplified and streamlined appearance to the outside world, while behind the scenes there may be many complex systems and processes at work.
- The facade pattern is often used when a system is very complex or difficult to understand because the system has a large number of interdependent classes or its source code is unavailable. This pattern hides the complexities of the larger system and provides a simpler interface to the client. It typically involves a single wrapper class that contains a set of members required by client. These members access the system on behalf of the facade client and hide the implementation details.
- Melarang akses terhadap suatu sistem yang kompleks dengan menyediakan interface yang lebih sederhana
- Mengurangi ketergantungan antar class

## Design Principle

- Principle of least knowledge (LoD) states that a software entity should interact with as few other entities as possible. (Talk only to your immediate friends) [source](https://en.wikipedia.org/wiki/Principle_of_least_knowledge)

## Structure

- Facade class provides a simplified interface to the client

## When to use

The Facade design pattern is best used in situations where you need to `provide a simplified interface to a complex system` or set of classes. It is often used to `hide the complexity` of a system and to provide a high-level, easy-to-use interface for clients.

For example, imagine you have a large software system consisting of `many interconnected classes and components`. The system might be `difficult` to use and understand for clients who do not have a deep understanding of its architecture. In this case, you can use a Facade to provide a `simplified interface` that `encapsulates` the complexity of the system and presents a `clear and easy-to-use` interface to clients.

Another example where the Facade pattern is useful is in `refactoring legacy code`. If you have an old system that is difficult to understand and maintain, you can use a Facade to encapsulate the legacy code and provide a simplified interface to the rest of the system. This can make it easier to work with the legacy code without having to change its internal implementation.

Overall, the Facade design pattern is best used when you need to simplify a complex system and provide a more user-friendly interface for clients, or when you need to refactor legacy code and make it more manageable.

## What is the pattern trying to solve?

The Facade design pattern is trying to solve the problem of complexity in software systems. Complex systems often consist of many interconnected classes and components, making them difficult to understand and use for clients who do not have a deep understanding of their architecture.

The Facade pattern provides a simplified interface to a complex system, hiding its complexity and presenting a clear and easy-to-use interface to clients. By encapsulating the complexity of the system behind a Facade, clients can interact with the system without needing to understand its internal workings. This simplifies the design of the system and makes it easier to use and maintain.

In essence, the Facade pattern is trying to provide a high-level, easy-to-use interface to a complex system, so that clients can interact with the system without needing to understand its internal complexity. By doing so, the Facade pattern can improve the usability, maintainability, and extensibility of a software system.

## When not to use

While the Facade design pattern can be very useful in simplifying a complex system and providing a high-level interface to clients, there are some situations where it may not be the best solution. Here are a few cases where the Facade pattern may not be appropriate:

When the underlying system or components are already simple and well-organized: If the system or components are already simple and well-organized, there may not be a need to add an additional layer of abstraction with a Facade. In this case, using a Facade pattern could add unnecessary complexity to the system.

When there is a need for fine-grained control over the system: If clients need fine-grained control over the system, a Facade pattern may not be appropriate. In this case, a more low-level interface may be necessary to allow clients to have more control over the system.

When the system is constantly changing: If the system is constantly changing, a Facade pattern may not be the best solution. This is because the Facade itself may need to be constantly updated to reflect changes in the underlying system or components, which could be a maintenance burden.

Overall, while the Facade pattern can be a useful tool for simplifying complex systems and providing a high-level interface to clients, it is important to carefully consider whether it is the best solution for a given situation, taking into account factors such as the complexity of the system, the needs of clients, and the level of maintenance required.
