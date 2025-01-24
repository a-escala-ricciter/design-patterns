Composite (also known as Object Tree) is a structural design pattern that lets you compose objects into tree structures 
and then work with these structures as if they were individual objects. 
The Composite pattern lets you run a behavior recursively over all components of an object tree.

## When to use it
* Use the Composite pattern when you have to implement a tree-like object structure.
* Use the pattern when you want the client code to treat both simple and complex elements uniformly.

## Pros
* You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
* Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, 
which now works with the object tree.

## Con
It might be difficult to provide a common interface for classes whose functionality differs too much. 
In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.

## Advantages of the Composite Pattern in the example:
**Uniformity**: Both files and folders implement the same interface, allowing the client to treat them uniformly.
**Scalability**: You can easily extend the file system by adding new operations or components.
**Hierarchical Structures**: Ideal for representing tree-like structures such as file systems, 
organizational charts, or UI component hierarchies.

### References
[Refactor Guru, 2024] https://refactoring.guru/design-patterns/composite
