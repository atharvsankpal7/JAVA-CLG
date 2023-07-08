package expt3;

class PrintIntChar3 {
    void print3(int a, char c) {
        System.out.println("The value of int is : " + a);
        System.out.println("The value of char is : " + c);
    }

    void print3(char a, int c) {
        System.out.println("The value of int is : " + c);
        System.out.println("The value of char is : " + a);
    }
}

public class _question_4 {
    public static void main(String[] args) {
        PrintIntChar3 pic = new PrintIntChar3();
        pic.print3(1, 'c');
        pic.print3('a', 2);
    }
}
