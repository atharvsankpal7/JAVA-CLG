package Experiment8;
//Create a base class student having member variable as roll, name and age declare the
//age of the student as final. inherit the student class in to a class called as studentdemo
//having member variable as age and declare the age of the student as 21 display
//function will print the age of the student.

class Student {
    int roll;
    String name;
    final int age;

    Student(int a) {
        age = a;
    }
}

class StudentDemo extends Student {
    StudentDemo(int a) {
        super(a);
    }

    int age = 21;

    void display() {
        System.out.println("Age: " + age);
    }
}

public class _question1 {
    public static void main(String[] args) {
        StudentDemo sd1 = new StudentDemo(5);
        sd1.display();
    }
}
