package Experiment5;


class Question5HelperClass {
    static int count = 0;

    static void showCount() {
        System.out.println("The number of objects created are " + count);
    }

    Question5HelperClass() {
        count++;
    }

}

public class _question_5 {
    public static void main(String[] args) {
        Question5HelperClass s1 = new Question5HelperClass();
        Question5HelperClass s2 = new Question5HelperClass();
        Question5HelperClass s3 = new Question5HelperClass();
        Question5HelperClass.showCount();
        Question5HelperClass s4 = new Question5HelperClass();
        Question5HelperClass s5 = new Question5HelperClass();
        Question5HelperClass.showCount();
    }
}
