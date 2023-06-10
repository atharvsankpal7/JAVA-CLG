package Experiment4;

import java.util.Scanner;

public class _question_4_Static_Method_2 {
    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number whose cube has to be found -->");
        System.out.println("The cube is --> " + cube(in.nextInt()));
    }
}
