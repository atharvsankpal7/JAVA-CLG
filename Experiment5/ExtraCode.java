package Experiment5;

import java.util.Scanner;

public class ExtraCode {
    private String sName;
    private int[] marks;
    private int i;
    private static int n;
    private int total;
    private static int tMax;
    private double avg;
    private static Scanner sc = new Scanner(System.in);

    public static void size() {
        System.out.println("Enter the number of subjects");
        n = sc.nextInt();
    }


    public void assign() {
        sc.nextLine();
        System.out.println("Enter name of student : ");
        sName = sc.nextLine();
        marks = new int[n];
        for (i = 0; i < marks.length; i++) {
            System.out.print("Enter marks object in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    public void compute() {

        total = 0;

        for (i = 0; i < n; i++) {
            total = total + marks[i];
        }

        tMax = total;

        avg = (double) total / n;
    }

    public void display() {
        System.out.println("Name of students : " + sName);
        System.out.println("Marks : ");
        for (i = 0; i < n; i++) {
            System.out.println("Marks in subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total marks : " + total);
        System.out.println("Average : " + avg);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExtraCode temp = new ExtraCode();
        temp.size();
        int m, k;

        System.out.print("Enter total no. of students : ");
        m = scan.nextInt();

        ExtraCode s[] = new ExtraCode[m];

        for (k = 0; k < m; k++) {
            s[k] = new ExtraCode();
            s[k].assign();
            s[k].compute();
            s[k].display();
        }

        System.out.println("Topper's total marks : " + tMax);

    }
}