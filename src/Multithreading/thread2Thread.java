package Multithreading;

public class thread2Thread {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        t1.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
    }
}
