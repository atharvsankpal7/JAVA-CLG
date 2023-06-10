package expt3;

import java.util.Scanner;

class Max6 {
    int max(int a, int b) {
        return a > b ? a : b;
    }

    int max(int a, int b, int c) {
        if (a > b) {
            return a > c ? a : c;
        } else {
            return b > c ? b : c;
        }
    }
}

public class _question_6 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Max6 mx1 = new Max6();
        System.out.println("Enter the three numbers for comparison -->");
        System.out.println("The max number among these is " + mx1.max(in.nextInt(), in.nextInt(), in.nextInt()));

        System.out.println("Enter the three numbers for comparison -->");
        System.out.println("The max number among these is " + mx1.max(in.nextInt(), in.nextInt()));

    }
}
