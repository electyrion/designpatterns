# Tuesday March 7, 2023

## Singleton

Think of a building with a `security` guard at the entrance. The security guard's job is to `make sure that only authorized people can enter the building`. However, there's `only one security guard` - if there were multiple guards, they might not know if someone had already been authorized to enter the building. The security guard is a singleton.

In software development, the singleton pattern works in a similar way. Imagine you have a `piece of code that needs to be accessed from multiple parts` of your program. However, you want to make sure that only one instance of the code is created - if there were multiple instances, they might `not be aware of each other` and could cause problems. The singleton pattern provides a way to `ensure that only one instance` of the code is created and accessed.

For example, imagine you have a program that needs to access a database. You want to `make sure that only one connection to the database is created and used throughout the program`. The singleton pattern provides a way to ensure that only one instance of the database connection is created and used.

So, in short, the singleton design pattern is a way of ensuring that only one instance of a piece of code is created and accessed. Just like a building might have only one security guard to ensure that only authorized people enter, a software program might use the singleton pattern to ensure that only one instance of a piece of code is created and accessed.

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

## Problem

- Menimbulkan issue multithreading
    Cara mengatasi: double check locking
- Menimbulkan issue lazy initialization (hanya dibuat saat dipanggil saja, terdapat pada static block) menimbulkan masalah jika sama2 dipanggil oleh thread yang berbeda, maka akan membuat 2 instance. Prinsip singleton akan terganggu
    Cara mengatasi: eager initialization. Membuat instance pada saat class di load. Masih terdapat issue juga di multithread (race condition).
    solving yg lebih baik: double check locking, akan terdapat flag siapa yg sedang menggunakan akses singleton, lock akses singleton, dan unlock akses singleton. thread lain akan menunggu terlebih dahulu sampai thread yg sedang menggunakan akses singleton selesai. Synchronized access to the singleton instance.
    