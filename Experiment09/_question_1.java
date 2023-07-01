package Experiment9;

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Eat function");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class _question_1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.eat();
        System.out.println();
        Animal d2 = new Dog();
        d2.eat();
        d2.sound();
    }
}
