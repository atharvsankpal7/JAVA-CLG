

public class question2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.roll = 2;
        System.out.println("The roll no of the student is " + s1.roll);
        System.out.println("The name no of the student is " + s1.name);
    }
}

class Student {
    String name;
    int roll;
}
