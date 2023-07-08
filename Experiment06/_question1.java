package Experiment6;
//1. You are required to develop a Java program that implements an interface to perform basic
//arithmetic operations. The interface, named "ArithmeticOperations," should define four
//methods: add, subtract, multiply, and divide. The program should also include a class named
//"Calculator" that implements the "ArithmeticOperations" interface.
//
//The "add" method should take two integers as parameters and return their sum.
//The "subtract" method should take two integers as parameters and return their difference.
//The "multiply" method should take two integers as parameters and return their product.
//The "divide" method should take two integers as parameters and return their quotient as a floating-point number.
//
//In the "Calculator" class, implement the methods defined in the "ArithmeticOperations" interface.
//Create an instance of the "Calculator" class and demonstrate the usage of each method by performing
//arithmetic operations on different pairs of numbers.
//
//Ensure that the program is user-friendly and provides clear instructions for inputting the numbers and
//displaying the results.


import java.util.Scanner;

interface ArithmeticOperations {
    int add(int a, int b);

    int subtract(int a, int b);

    int divide(int a, int b);

    int muliply(int a, int b);
}

class Calculator implements ArithmeticOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int muliply(int a, int b) {
        return a * b;
    }
}

public class _question1 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        Calculator c1 = new Calculator();
        System.out.println("Enter two numbers for addition --> ");
        System.out.println("The addition of these two numbers is : " + c1.add(io.nextInt(), io.nextInt()));
        System.out.println("Enter two numbers for subtraction --> ");
        System.out.println("The subtraction of these two numbers is : " + c1.subtract(io.nextInt(), io.nextInt()));
        System.out.println("Enter two numbers for multiplication --> ");
        System.out.println("The multiplication of these two numbers is : " + c1.muliply(io.nextInt(), io.nextInt()));
        System.out.println("Enter two numbers for division --> ");
        System.out.println("The division of these two numbers is : " + c1.divide(io.nextInt(), io.nextInt()));
    }
}
