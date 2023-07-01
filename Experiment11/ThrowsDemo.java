package Experiment11;

public class ThrowsDemo {
 static void check() throws ArrayIndexOutOfBoundsException{
     int [] arr = new int[5];
     arr[5]=10;
    }
    public static void main(String[] args)  {
        try {
            check();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
