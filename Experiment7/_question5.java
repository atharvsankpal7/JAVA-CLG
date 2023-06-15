package Experiment7;

class Shape_q5 {
    double calculateArea() {
        return 0.00;
    }
}

class Circle_q5 extends Shape_q5 {
    double radius;

    Circle_q5(double radius) {
        this.radius = radius;
    }


    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle_q5 extends Shape_q5 {
    double length;
    double width;

    Rectangle_q5(double length, double width) {
        this.length = length;
        this.width = width;
    }


    double calculateArea() {
        return length * width;
    }
}

public class _question5 {
    public static void main(String[] args) {
        Shape_q5 circle = new Circle_q5(3);
        Shape_q5 rectangle = new Rectangle_q5(4, 6);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
;;