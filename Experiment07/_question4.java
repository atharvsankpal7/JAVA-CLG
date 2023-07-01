package Experiment7;

abstract class Shape_q4 {
    abstract double calculateArea();
}

class Rectangle_q4 extends Shape_q4 {
    double length;
    double width;

    Rectangle_q4(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
        return area;
    }
}

class Circle_q4 extends Shape_q4 {
    double radius;

    Circle_q4(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }
}

class Triangle_q4 extends Shape_q4 {
    double base;
    double height;

    Triangle_q4(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
        return area;
    }
}

public class _question4 {
    public static void main(String[] args) {
        Shape_q4 rectangle = new Rectangle_q4(4, 6);
        Shape_q4 circle = new Circle_q4(3);
        Shape_q4 triangle = new Triangle_q4(5, 8);

        rectangle.calculateArea();
        circle.calculateArea();
        triangle.calculateArea();
    }
}


