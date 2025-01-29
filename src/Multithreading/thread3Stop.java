package Multithreading;

public class thread3Stop {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        t1.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //t1.stop();
        t1.interrupt();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (!isInterrupted()) {
            System.out.println(Thread.currentThread().getName() + " work - " + count++);
        }
        System.out.println("thread stop");
    }
}
