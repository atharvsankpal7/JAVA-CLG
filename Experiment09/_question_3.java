package Experiment9;

abstract class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayShape() {
        System.out.print("shape " + name);
    }

}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class _question_3 {
    public static void main(String[] args) {
        Shape r1 = new Rectangle("Rectangle", 2.3, 4.1);
        Shape r2 = new Circle("Circle", 12.354);
        System.out.print("The area of ");
        r1.displayShape();
        System.out.println(" is : " + r1.calculateArea());
        System.out.print("The area of ");
        r2.displayShape();
        System.out.println(" is : " + r2.calculateArea());
    }
}
