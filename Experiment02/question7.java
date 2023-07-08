
import java.util.Scanner;   

public class question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        int l = in.nextInt();
        int b = in.nextInt();
        Rectangle7 r1 = new Rectangle7(l, b);
        System.out.println("The area of rectangle  is : " + r1.Area());

    }
}

class Rectangle7 {
    int length;
    int breadth;

    Rectangle7(int l, int b) {
        length = l;
        breadth = b;
    }

    public int Area() {
        return length * breadth;
    }
}
