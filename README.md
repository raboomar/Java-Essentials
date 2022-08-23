# Java-Essentials

Encapsulation:
The practice of keeping fields within a class private,
then providing access to those fields via public methods.

EX:
private double price
public double getPrice(){
return price
}

Inheritance:
When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.

EX:
We cna have a class called animal and the classes dog and cat extends animal and they have all the methods in the animal class.

Abstraction:
Hiding internal details and showing functionality is known as abstraction.

EX:
THe animal class becomes abstract and we have a makeSound method and each class overrides that method and is forces to implement that method because every animal makes a sound

Polymosphism:
If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.
In Java, we use method overloading and method overriding to achieve polymorphism.

Ex:
the make sound method the dog class goes bark bark but the cat class goes meow meow
