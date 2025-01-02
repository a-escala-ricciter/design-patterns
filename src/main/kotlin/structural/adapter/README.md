The Adapter Pattern is a structural design pattern that acts as a bridge between two incompatible interfaces. 
It allows classes to work together that couldn't otherwise because of incompatible interfaces.

## When to use it
* Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code. 
* Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.

## Pros
* Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
* Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

## Con
The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.

### References
[Refactor Guru, 2024] https://refactoring.guru/design-patterns/adapter