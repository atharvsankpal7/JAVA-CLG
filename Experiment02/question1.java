import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        int l = in.nextInt();
        int b = in.nextInt();
        Area obj1 = new Area();
        obj1.setDim(l, b);
        obj1.getArea();
    }
}

class Area {
    int length;
    int breadth;

    public void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    public void getArea() {
        System.out.println("The area of the rectangle is : " + length * breadth);
    }
}
