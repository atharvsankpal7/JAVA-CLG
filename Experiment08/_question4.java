package Experiment8;

//Create a parent class called Parent with the following specifications:
//Include a instance variable called parentVariable of type int.
//Implement a parameterized constructor that takes an integer parameter and assigns its
//
//value to the parentVariable.
//Include a method called parentMethod that displays the value of parentVariable.
//Create a child class called Child that extends the Parent class with the following
//specifications:
//Include a instance variable called childVariable of type String.
//Implement a parameterized constructor that takes an integer and a string parameter.
//Use the super keyword to invoke the constructor of the parent class and assign the
//integer parameter to the parentVariable.
//Implement a method called childMethod that displays the value of both parentVariable
//and childVariable.
//In the main method of your program, create an object of the Child class and
//demonstrate the usage of the super keyword by invoking the parentMethod and
//childMethod from the child object.
class Parent {
    int parentVariable;

    Parent(int pv) {
        parentVariable = pv;
    }

    void parentMethod() {
        System.out.println("parentVariable : " + parentVariable);

    }
}

class Child extends Parent {
    String childVariable;
    Child(int pv,String cv){
        super(pv);
        childVariable=cv;
    }
    void childMethod(){
        System.out.println("parentVariable : " + super.parentVariable);
        System.out.println("childVariable : " + childVariable);

    }
}

public class _question4 {
    public static void main(String[] args) {
        Child c1 = new Child(10, "Hello World!");
        c1.childMethod();
    }
}
