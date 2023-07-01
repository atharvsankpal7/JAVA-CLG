package Experiment11;

public class ArrayOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            arr[5]=10;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("Hello");
        }
    }
}
