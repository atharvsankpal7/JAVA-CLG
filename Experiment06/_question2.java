package Experiment6;

//2. Problem Statement: Design an interface in Java to calculate the area of different shapes.
//        Create an interface named "Shape" that includes the following methods:
//        calculateArea(): This method should return the area of the shape as a double value.
//        Next, implement three classes that implement the "Shape" interface:
//        Circle: This class should have a constructor that takes the radius of the circle as a parameter and
//        implements the calculateArea() method to calculate and return the area of the circle.
//        Rectangle: This class should have a constructor that takes the length and width of the rectangle as
//        parameters and implements the calculateArea() method to calculate and return the area of the
//        rectangle.
//        Triangle: This class should have a constructor that takes the base and height of the triangle as
//        parameters and implements the calculateArea() method to calculate and return the area of the triangle.
//
//        Write a Java program that demonstrates the usage of the interface and the implemented classes. It
//        should create objects of the Circle, Rectangle, and Triangle classes, call the calculateArea() method for
//        each object, and display the calculated areas.
interface Shape_question2 {
    double PI = 3.14;

    double calculateArea();

}

class Circle implements Shape_question2 {
    int radius;

    Circle(int r) {
        radius = r;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

class Rectangle implements Shape_question2 {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }


    public double calculateArea() {
        return length * breadth;
    }

}

class Triangle implements Shape_question2 {
    double base;
    double height;

    Triangle(double l, double b) {
        base = l;
        height = b;
    }


    public double calculateArea() {
        return .5 * base * height;
    }

}

public class _question2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.printf("The area of circle is %.2f\n", c1.calculateArea());
        Rectangle r1 = new Rectangle(3.4, 4);
        System.out.println("The area of rectangle is " + r1.calculateArea());
        Triangle t1 = new Triangle(22.3, 1);
        System.out.println("The area of Triangle is " + t1.calculateArea());

    }
}
