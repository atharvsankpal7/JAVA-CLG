package Experiment5;

class student {
    int m1, m2, m3;

    student(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }
}

class CalculateMarks extends student {
    int total;

    CalculateMarks(int a, int b, int c) {
        super(a, b, c);
        total = m1 + m2 + m3;
    }

}


class CalculatePercentage extends CalculateMarks {
    float percentage;

    CalculatePercentage(int a, int b, int c) {
        super(a, b, c);
        percentage = ( ((a + b + c) / (float)3));
        System.out.println("The percentage of the student is " + percentage);
    }
}

public class _question_2 {
    public static void main(String[] args) {
        CalculatePercentage c1= new CalculatePercentage(76,89,67);
    }
}
