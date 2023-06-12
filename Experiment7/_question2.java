package Experiment7;

class Shape {
    double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Circle - Area: %.2f\n", area);
        return area;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        double area = length * width;
        System.out.println("Rectangle - Area: " + area);
        return area;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle - Area: " + area);
        return area;
    }
}

public class _question2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 8);

        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }
}

