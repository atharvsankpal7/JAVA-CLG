package Experiment12;

import java.io.*;

 class FileHandling2 {
  static void demo1() {
    try {
      File file = new File("demo1.txt");
      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write("This line is written by deleting previous lines\n");
      System.out.println("Done");
      fileWriter.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  static void demo2() {
    try {
      File file = new File("demo2.txt");
      FileWriter fileWriterAppend = new FileWriter(file, true);
      fileWriterAppend.write("This line is appended\n");
      System.out.println("Done");
      fileWriterAppend.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  static void demo3() {
    try {
      File file = new File("demo3.txt");
      FileReader fileReader = new FileReader(file);
      // String s ="";
      int i;
      while ((i = fileReader.read()) != -1) {
        System.out.print((char) i);
        // s+=(char)i;
      }
      // System.out.println(s);
      fileReader.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    // demo1();
    // demo2();
    demo3();
  }
}