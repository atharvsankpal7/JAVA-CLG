package Experiment8;

//Create a base class named superclass having member variable name int x which is
//initialized with value 40. Class baseclass is derived from the class superclass having the
//member variable name same as the parent class which is initialized with number 60.
//Demonstrate a program to print the member variable of both parent and child class
//using super keyword.
class SuperClass {
    int x = 40;

}

class DerviedClass extends SuperClass {
    int x = 60;

    void display() {
        System.out.println("x: " + x);
        System.out.println("super x: " + super.x);
    }

}

public class _question2 {
    public static void main(String[] args) {
        DerviedClass dc1 = new DerviedClass();
        dc1.display();
    }
}
