package expt3;

class Area5 {
    void area(int a, int b) {
        System.out.println("The area of the rectangle is " + a * b);
    }

    void area(int s) {
        System.out.println("The area of square is " + s * s);
    }
}

public class _question_5 {
    public static void main(String[] args) {
        Area5 a1 = new Area5();
        a1.area(4);
        a1.area(4, 5);
    }
}
