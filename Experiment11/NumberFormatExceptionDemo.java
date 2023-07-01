package Experiment11;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String str= "1";
        try{
            int n= Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println(e);
        }finally {
            System.out.println("Hello");
        }
    }
}
