import java.util.Scanner;

public class question8 {
    static float calc(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the number whose average has to be calculated --> ");
        System.out.println("The avergae of these three numbers is "+ calc(io.nextInt(), io.nextInt(), io.nextInt()));        
    }
}