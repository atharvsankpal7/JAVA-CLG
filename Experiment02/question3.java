
public class question3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.name = "John";
        s1.roll = 2;
        s1.mobileno = 1234567890;
        s2.name = "Sam";
        s2.roll = 3;
        s2.mobileno = 1357924860;

        System.out.println("The roll no of the student is " + s1.roll);
        System.out.println("The name no of the student is " + s1.name);
        System.out.println("The phone no of the student is " + s1.mobileno);
        System.out.println("The roll no of the student is " + s2.roll);
        System.out.println("The name no of the student is " + s2.name);
        System.out.println("The phone no of the student is " + s2.mobileno);
    }
}

class Student3 {
    String name;
    int roll;
    long mobileno;
}
