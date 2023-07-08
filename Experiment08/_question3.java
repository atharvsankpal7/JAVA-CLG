package Experiment8;

class Animal {
    void display() {
        System.out.println("This is animal class");
    }
}

class Dog extends Animal {
    void display() {

        System.out.println("This is dog class");
    }

    void printMessage() {
        display();
        super.display();
    }
}

public class _question3 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.printMessage();
    }
}
