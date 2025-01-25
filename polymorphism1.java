package polymorphismexample;


class Animal {
 void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass 1: Dog
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Woof! Woof!");
 }
}

//Subclass 2: Cat
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Meow! Meow!");
 }
}

//Subclass 3: Cow
class Cow extends Animal {
 @Override
 void makeSound() {
     System.out.println("Moo! Moo!");
 }
}

public class polymorphism {
 public static void main(String[] args) {
     // Parent class reference pointing to child class objects
     Animal animal;

     // Dog sound
     animal = new Dog();
     animal.makeSound();

     // Cat sound
     animal = new Cat();
     animal.makeSound();

     // Cow sound
     animal = new Cow();
     animal.makeSound();
 }
}
