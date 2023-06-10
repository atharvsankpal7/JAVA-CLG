
import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.println("Enter the complex number one :");
        c1.real = io.nextInt();
        c1.img = io.nextInt();
        System.out.println("Enter the complex number two :");
        c2.real = io.nextInt();
        c2.img = io.nextInt();

        c1.sum(c2);
        c1.diff(c2);
        c1.prod(c2);
    }


}

class Complex {
    public
    int real;
    int img;

    public void sum(Complex c2) {
        System.out.println("The sum of these two imaginary numbers is : " + (real + c2.real)
                + " + (" + (img + c2.img) + "i)");
    }

    public void diff(Complex c2) {
        System.out.println("The diff of these two imaginary numbers is : " + (real - c2.real)
                + " + (" + (img - c2.img) + "i)");
    }

    public void prod(Complex c2) {
        System.out.println("The product of these two imaginary numbers is : " + ((real * c2.real) - (img * c2.img))
                + " + (" + ((img * c2.real) + (real * c2.img)) + "i)");
    }

}