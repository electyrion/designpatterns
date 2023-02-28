# Tuesday 28 February 2023

## Facade

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
