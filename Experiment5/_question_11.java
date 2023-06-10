package Experiment5;

import java.util.Scanner;

class Student_Question11 {
    String sName;
    int[] marksArr = new int[5];
    int totalMark;
    int marksMax;
    float avgMarks;
    static int TOTALMAXMARKS = -1;

    void assign() {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the name of student --> ");
        sName = io.next();
        System.out.println("Enter the marks of student -->");
        for (int i = 0; i < marksArr.length; i++) {
            System.out.println("Enter the marks for student " + (i + 1));
            marksArr[i] = io.nextInt();
        }
    }

    void compute() {
        totalMark = marksArr[0];
        marksMax = marksArr[0];
        for (int i = 1; i < marksArr.length; i++) {
            totalMark += marksArr[i];
            if (marksMax < marksArr[i]) {
                marksMax = marksArr[i];
            }
        }
        avgMarks = totalMark / (float) 5;
        if (totalMark > TOTALMAXMARKS) {
            TOTALMAXMARKS = totalMark;
        }
    }

    void display() {
        System.out.println("The name of the student is -->" + sName);
        System.out.println("The total marks of the student are --> " + totalMark);
        System.out.println("The maximum mark of the student is --> " + totalMark);
    }

    static void displayMaxMarks() {
        System.out.println("The total maximum marks from class are --> " + TOTALMAXMARKS);
    }
}

public class _question_11 {
    public static void main(String[] args) {
        Student_Question11 s1 = new Student_Question11();
        s1.assign();
        Student_Question11 s2 = new Student_Question11();
        s2.assign();
        Student_Question11.displayMaxMarks();
        Student_Question11 s3 = new Student_Question11();
        s3.assign();
        Student_Question11 s4 = new Student_Question11();
        s4.assign();
        Student_Question11.displayMaxMarks();
    }
}
