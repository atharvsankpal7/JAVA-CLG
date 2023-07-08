package Experiment5;

import java.util.Scanner;

class base {
    int a, b;

    base() {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a = io.nextInt();
        b = io.nextInt();
    }
}

class derived extends base {
    void show() {
        System.out.println("The sum of these two numbers is " + (a + b));
    }
}

public class _question_1 {
    public static void main(String[] args) {
        derived d1 = new derived();
        d1.show();
    }
}
