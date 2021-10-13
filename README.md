## OOP in Java

> Object-Oriented Programming is a methodology or paradigm to design a program using classes and Objects

## Main Concepts in OOP

- Object
- class
- Inheritance(extends)
- Polymorphism
- Abstraction
- Encapsulation


- Override
- Implements

## Object 

> Any entity that has a state and behavior is known as an object.
e.g Book1AbstructClass, Chair.

> An object can be defined as instance of a class.

## class

> A class can be defined as a blueprint from which you can create an individual object.


## Implements
> This relation may hold between a class and an interface.

> if C Implements I then C contains code for the behavior specified in interface I 

          Class C Implements I {
            // bodies for methods specified in I
          }

## Inheritance(extends)

> The extends relation may hold between 
- Two interfaces
- Two classes

> If B extends A then B Inherits all the methods of A.

## Abstraction

> Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing.

## Encapsulation
> Encapsulation focus on Private Data. Encapsulation allows the programmer to hide and restrict access to data. 

> To achieve encapsulation:
  - Declare the variables with the private access modifier
  - Create public getters and setters that allow indirect access to those variables

## Caveats About Java interfaces
- interfaces cannot have constructors.
- interfaces cannot have static method contracts without also providing correspoding method bodies.

## Caveats About Java classes
- constructors are not inherited.
- Static methods are inherited.

## What does overriding do?
> To override a method means methods that are already being implemented in a class being extended can be overwritten and provided new method bodies.

> Java and other object-Oriented languages decide which method body to use for any call to an instance based on the object type of the receiver.
- This behavior for calling methods is known as ___Polymorphism___.

## When is a method overloaded?
> A method is overloaded when two or more methods have the same name, in which case the methods must differ in the number and/or types of their formal parameters(Which the compiler uses to differiate the methods).

## Access modifiers
> Private: The private access modifier is specified using the keyword private. The methods or data members declared as private are accessible only within the class in which they are declared. Any other class of the same package will not be able to access these members

> Protected: The protected keyword is an access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses.

> public: The public access modifier is specified using the keyword public. The public access modifier has the widest scope among all other access modifiers. Classes, methods, or data members that are declared as public are accessible from everywhere in the program.
