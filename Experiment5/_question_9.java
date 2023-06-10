package Experiment5;

import java.util.Scanner;


class Student_Question9 {
    int mark;
    String name;
}

class MarkName extends Student_Question9 {
    void setData(int m, String n) {
        mark = m;
        name = n;
    }

    void getData() {
        System.out.println("The marks of student of with name " + name + " is " + mark);
    }
}

public class _question_9 {
    public static void main(String[] args) {
        final int studentCount = 10;
        String temp;
        Scanner io = new Scanner(System.in);
        MarkName[] mnArr = new MarkName[studentCount];
        System.out.println("Enter the information of students");
        for (int i = 0; i < mnArr.length; i++) {
            mnArr[i] = new MarkName();
            System.out.println("Enter the name of student --> ");
            temp = io.next();
            System.out.println("Enter the marks of student --> ");
            mnArr[i].setData(io.nextInt(), temp);
        }
        for (MarkName markName : mnArr) {
            markName.getData();
        }
    }
}
