package expt3;

class Student {
    Student(int r, String n) {
        int roll = r;
        String name = n;
        System.out.println("Roll number: " + roll + " Name: " + name);
    }

    Student(int r, String n, double m) {
        int roll = r;
        String name = n;
        double marks = m;
        System.out.println("Roll number: " + roll + " Name: " + name + " Marks: " + marks);
    }

}

public class _question_1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Viraj");
        Student s2 = new Student(2, "Aniket", 99.99);
    }
}
