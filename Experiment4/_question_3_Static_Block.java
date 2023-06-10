package Experiment4;

public class _question_3_Static_Block {
    static {
        System.out.println("This is static block of parent class");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        question_3 s3 = new question_3();
        question_3 s4 = new question_3();
    }
}

class question_3 {
    static {
        System.out.println("This is static block of question_3 class");
    }
}