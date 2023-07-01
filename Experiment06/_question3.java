package Experiment6;

import java.util.Scanner;

//3. Problem Statement: Create a Java program that implements an interface called "Shape" to
//represent different geometric shapes. The interface should contain the following methods:
//calculateArea(): This method should be used to calculate the area of the shape and return it as a double.
//calculatePerimeter(): This method should be used to calculate the perimeter of the shape and return it
//as a double.
//Create three classes that implement the "Shape" interface: "Circle", "Rectangle", and "Triangle". Each
//class should provide its own implementation for the calculateArea() and calculatePerimeter() methods.
//Write a main program that demonstrates the usage of these classes. Create objects of each class, set
//appropriate values for their dimensions, and display the calculated area and perimeter of each shape.
interface Shape_question3 {
    double PI = 3.14;

    double calculateArea();

    double calculatePerimeter();
}

class Circle_question3 implements Shape_question3 {
    int radius;

    Circle_question3(int r) {
        radius = r;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

class Rectangle_question3 implements Shape_question2 {
    double length;
    double breadth;

    Rectangle_question3(double l, double b) {
        length = l;
        breadth = b;
    }


    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle_question3 implements Shape_question2 {
    double base;
    double height;
    static Scanner io = new Scanner(System.in);

    Triangle_question3(double l, double b) {
        base = l;
        height = b;
    }


    public double calculateArea() {
        return .5 * base * height;
    }

    public double calculatePerimeter() {
        System.out.println("enter the sides of triangle -->");
        return io.nextInt() + io.nextInt() + io.nextInt();
    }
}

public class _question3 {
    public static void main(String[] args) {
        Circle_question3 c1 = new Circle_question3(3);
        System.out.printf("The area of circle is %.2f\n", c1.calculateArea());
        System.out.printf("The perimeter of the circle is %.2f\n", c1.calculatePerimeter());
        Rectangle_question3 r1 = new Rectangle_question3(3.4, 4);
        System.out.println("The area of rectangle is " + r1.calculateArea());
        System.out.println("The perimeter of rectangle is " + r1.calculatePerimeter());
        Triangle_question3 t1 = new Triangle_question3(22.3, 1);
        System.out.println("The area of Triangle is " + t1.calculateArea());
        System.out.println("The perimeter of Triangle is " + t1.calculatePerimeter());
    }
}
