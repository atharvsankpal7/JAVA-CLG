package expt3;

class Syoverload {
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

public class _question_2 {
    public static void main(String[] args) {
        Syoverload s1 = new Syoverload();
        System.out.println(s1.max(3, 2));
        System.out.println(s1.max(1, 2, 3));
    }
}
