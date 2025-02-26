The Bridge Pattern is a structural design pattern that separates the abstraction from its implementation, 
allowing both to evolve independently. It’s particularly useful when a class needs to support multiple 
variations of behavior and implementation without creating a complex hierarchy.

## When to use it
* Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some 
functionality (for example, if the class can work with various database servers).
* Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
* Use the Bridge if you need to be able to switch implementations at runtime.

## Pros
* You can create platform-independent classes and apps.
* The client code works with high-level abstractions. It isn’t exposed to the platform details.
* Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
* Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.

## Con
* You might make the code more complicated by applying the pattern to a highly cohesive class.

### References
[Refactor Guru, 2024] https://refactoring.guru/design-patterns/bridge
