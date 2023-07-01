package Experiment11;

public class NullPointerExceptionDemo {
    public static void main(String[] args ) {
        String str=null;
        try{
            System.out.println(str.length());

        }catch(Exception e){
            System.out.println("Error : "+e);
        }finally {
            System.out.println("Hello There");
        }
    }
}