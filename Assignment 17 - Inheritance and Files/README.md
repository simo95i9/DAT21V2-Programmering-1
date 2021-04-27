# Assignment 16 - Inheritance and Files


## Exercise 1
*In 250 words or less:*
*In your own words - describe the concepts and mechanisms used in inheritance*

 In Java—and programming generally—classes can inherit from each other.
 In Java we write it with the syntax `class Cat extends Animal`.
 
 When class B inherits from another class A,
 class B will be referred to as the super class,
 and class A will be referred to as the sub class.
 
 The sub class will get the properties and methods of its super class,
 In Java a sub class can inherit methods with implementations already provided from the super class,
 or it can inherit an abstract method, in this case the sub class has to provide its own implementation.
 
 When two objects with different classes share the same super class those two objects
 can be used in the same way.
 
 For an example a cat and a goat can be considered two different classes,
 but both are an animal so we can treat them evenly when we call their common methods,
 such as asking how many legs they each have. 
 
 
 

## Exercise 2
*Write a program that exemplifies the concept of inheritance.*
*Comment the program accordingly to describe your example.*

*You should use real-life concepts as classes in the program.*

See [Geometry.java](src/Geometry.java)

## Exercise 3
*Write a program that reads a file with `n` number of strings separated by line breaks.*
*The program determines and prints how many words are in the file.*

See [WordCounter.java](src/WordCounter.java)
