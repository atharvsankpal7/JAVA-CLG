package Experiment4;

public class _question_2_Static_method {

    public static void main(String[] args) {
        question_2.function_name();
    }
}

class question_2 {
    //Can be invoked without object
    static void function_name() {
        System.out.println("This is a static method");
    }
}