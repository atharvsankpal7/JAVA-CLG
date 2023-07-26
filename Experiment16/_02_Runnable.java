package Experiment16;

// runnable is bullet and thread is gun
class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hehe");
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("bruhhhhhhhhhhhh");
        }
    }
}

public class _02_Runnable {
    public static void main(String[] args) {
        MyRunnable1 runnable1 = new MyRunnable1();
        MyRunnable2 runnable2 = new MyRunnable2();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
