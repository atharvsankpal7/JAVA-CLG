package Experiment10.Package2;

import Experiment10.Package1.*;

public class _question_1 {
    public static void main(String[] args) {
        System.out.println("Even Odd No;");
        EvenOdd e1 = new EvenOdd();
        e1.show(3);

        System.out.println("\nArmstrong numbers:");
        ArmStrongNo asn1 = new ArmStrongNo();
        System.out.println(asn1.check(13));
        System.out.println(asn1.check(153));

        System.out.println("\nPalindromes:");
        Palindrome p1 = new Palindrome();
        System.out.println(p1.check(101));
        System.out.println(p1.check(11011));
        System.out.println(p1.check(1171));


        System.out.println("\nThree Number Operations:");
        ThreeNoOperations tno1 = new ThreeNoOperations();
        System.out.println(tno1.max(10, 32, 4));
        System.out.println(tno1.min(10, 32, 4));


        System.out.println("\nPrime NO:");
        PrimeNo pn1 = new PrimeNo();
        System.out.println(pn1.check(2435));
        System.out.println(pn1.check(217));
        System.out.println(pn1.check(17));
    }
}
