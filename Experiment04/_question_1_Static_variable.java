package Experiment4;

public class _question_1_Static_variable {

    public static void main(String[] args) {
        System.out.println("The value of static variable is for class question_1 is --> " + question_1.common_data);
        System.out.println(
                "The value of static String variable is for class question_1 is --> " + question_1.common_data_string);
    }
}

class question_1 {
    static int common_data = 10;
    static String common_data_string = "Hello";

}