# Tuesday 28 February 2023

## Adapter

Think of an `electrical adapter` that you might use when you're traveling to a different country. In one country, the electrical outlets might use a different type of plug than in another country. If you want to use your electronic devices, you'll need to use an adapter to convert the plug so that it fits into the outlet.

In software development, the adapter pattern works in a similar way. Imagine you have two different pieces of software that were not `designed to work together`. They might have `different` interfaces or different data formats, which means they can't communicate with each other directly. The adapter pattern provides a way `to bridge the gap` between these two pieces of software by `creating a new piece of software` that can understand both interfaces or data formats.

For example, imagine you have a database of customer information that uses one format, and you want to display that information on a website that uses a different format. You could use an adapter to convert the customer information from one format to the other so that it can be displayed on the website.

So, in short, the adapter design pattern is a way of `converting the interface or data format` of one piece of software so that it can work with another piece of software that was not designed to be compatible. Just like an electrical adapter, the adapter pattern provides a way to bridge the gap between two different systems that would otherwise be incompatible.

- Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

## Class based approach vs Object based approach

- Class based approach: Adapter class implements the interface of the target class and has a reference to the adaptee class.
- Object based approach: Adapter class has a reference to the target class and the adaptee class.
