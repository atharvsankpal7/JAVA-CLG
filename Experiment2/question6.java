package Experiment2;

public class question6 {
    public static void main(String[] args) {
        Rectangle6 r1 = new Rectangle6(4, 5);
        Rectangle6 r2 = new Rectangle6(5, 8);
        System.out.println("The area of rectangle one is : " + r1.Area());
        System.out.println("The area of rectangle two is : " + r2.Area());
    }
}

class Rectangle6 {
    int length;
    int breadth;

    Rectangle6(int l, int b) {
        length = l;
        breadth = b;
    }

    public int Area() {
        return length * breadth;
    }
}
