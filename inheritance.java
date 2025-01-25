package inheritanceexample;


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Output: Animal is eating
        myDog.bark(); // Output: Dog is barking
    }
}
