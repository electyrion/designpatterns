# Observer Pattern

Observer design pattern is a pattern used to establish a communication mechanism between objects in a software application. It involves two main components, the "subject" and the "observer."

The "subject" is an object that maintains a list of its dependents, also known as observers, and notifies them automatically of any changes in its state. For example, imagine a weather application that provides live updates about the temperature and other weather conditions. The "subject" in this scenario would be the application that is constantly monitoring the weather conditions and updating its state when the temperature changes.

The "observer" is an object that wants to be notified of changes in the state of the subject. In our weather application example, an observer could be a user who wants to be notified whenever the temperature changes beyond a certain threshold. The observer subscribes to the subject, and when the subject's state changes, the observer is notified and updated accordingly.

In simple terms, the observer design pattern establishes a way for objects to listen for changes in other objects and take appropriate actions based on those changes. It is a common way of implementing event-driven systems where one object needs to know about the changes happening in another object.

## Pull vs Push Model

In the observer design pattern, there are two common models of communication between the subject and the observer: the push model and the pull model.

In the push model, the subject sends updates to its observers automatically, without them requesting any specific information. When the state of the subject changes, it sends the new state to all registered observers. This approach is useful when observers are interested in all changes made to the subject and do not need to know specific details about what has changed.

In the pull model, the observer must explicitly request information from the subject whenever it wants to know about changes in its state. In this model, the observer polls the subject for updates, and the subject provides the requested information. This approach is useful when observers are only interested in specific aspects of the subject's state and do not need to be notified about all changes.

To summarize, the main difference between the push and pull models in the observer design pattern is the direction of communication: push model involves automatic updates pushed from the subject to the observer, while in the pull model, the observer has to actively request information from the subject.
