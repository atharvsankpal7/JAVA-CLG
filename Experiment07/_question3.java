package Experiment7;

abstract class Shape_q3 {
    abstract double calculateArea();
}

class Circle_q3 extends Shape_q3 {
    double radius;

    Circle_q3(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle_q3 extends Shape_q3 {
    double length;
    double width;

    Rectangle_q3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class _question3 {
    public static void main(String[] args) {
        Shape_q3[] shapes = new Shape_q3[4];
        shapes[0] = new Circle_q3(1.23);
        shapes[1] = new Rectangle_q3(4, 6);
        shapes[2] = new Circle_q3(3);
        shapes[3] = new Rectangle_q3(2, 8);

        for (Shape_q3 shape : shapes) {
            System.out.printf("Area: %.2f\n" , shape.calculateArea());
        }
    }
}
