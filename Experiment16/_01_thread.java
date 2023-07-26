package Experiment16;
//The start method calls the run method concurrently
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("I am Thread 1");
        }
    }


}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hehe");
        }
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Sugmaballz");
        }
    }
}

public class _01_thread extends Thread {

    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
