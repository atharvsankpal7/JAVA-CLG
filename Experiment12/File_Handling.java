package Experiment12;

import java.io.FileWriter;

public class File_Handling {
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("abc.text");
            f1.write("Hello");
            f1.flush();
            f1.close();
            System.out.println("Done ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
