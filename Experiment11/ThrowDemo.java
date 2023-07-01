package Experiment11;

public class ThrowDemo {
    public static void main(String[] args) {
        int choice=19;
        try{
            if(choice<=18){
                throw new ArithmeticException("Ineligible");
            }
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
