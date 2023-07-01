import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        AddDistance obj1 = new AddDistance();
        AddDistance obj2 = new AddDistance();
        AddDistance obj3 = new AddDistance();
        System.out.println("Enter the first distance ");
        obj1.feet = io.nextInt();
        obj1.inch = io.nextInt();
        System.out.println("Enter the second distance ");
        obj2.feet = io.nextInt();
        obj2.inch = io.nextInt();
        obj3 = obj1.addDistance(obj2);
        if (obj3.inch >= 12) {
            int temp = obj3.inch / 12;
            
            obj3.feet += temp;
            obj3.inch -= temp * 12;
        }
        System.out.println("The sum of these two distances is " + obj3.feet + " feets " + obj3.inch + " inches ");
    }
}

class AddDistance {
    public int feet, inch;

    public AddDistance addDistance(AddDistance o) {
        AddDistance ret = new AddDistance();
        ret.feet = feet + o.feet;
        ret.inch = inch + o.inch;
        return ret;
    }
}
