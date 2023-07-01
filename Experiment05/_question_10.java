package Experiment5;


interface P1 {
    int variableP1 = 1;

    void methodP1();

}

interface P2 {
    int variableP2 = 2;

    void methodP2();

}

interface P12 extends P1, P2 {
}

class Q implements P12 {

    public void methodP1() {
        System.out.println("The value of variableP1 is -->" + variableP1);
    }

    public void methodP2() {
        System.out.println("The value of variableP2 is -->" + variableP2);

    }
}

public class _question_10 {
    public static void main(String[] args) {
        Q q1 = new Q();
        q1.methodP1();
        q1.methodP2();
    }
}
