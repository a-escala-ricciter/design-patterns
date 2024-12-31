Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

## When to use it
* Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.
* Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.

## Pros
* Open/Closed Principle. You can introduce new subscriber classes without having to change the publisher’s code 
(and vice versa if there’s a publisher interface). 
* You can establish relations between objects at runtime.

## Con
Subscribers are notified in random order.

### References
[Refactor Guru, 2024] https://refactoring.guru/design-patterns/observer
