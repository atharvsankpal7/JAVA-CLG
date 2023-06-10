package expt3;

class PrintNumber {
    void printn(int a) {
        System.out.println(a);
    }

    void printn(String a) {
        System.out.println(a);
    }

    void printn(long a) {
        System.out.println(a);
    }

    void printn(double a) {
        System.out.println(a);
    }

    void printn(float a) {
        System.out.println(a);
    }
}

public class _question_3 {
    public static void main(String[] args) {
        PrintNumber pn1 = new PrintNumber();
        pn1.printn(1);
        pn1.printn("Hello");
        pn1.printn(125625.262456);
        pn1.printn(2345646752946592L);
        pn1.printn(234567.24435F);
    }
}
