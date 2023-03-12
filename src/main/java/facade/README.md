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
