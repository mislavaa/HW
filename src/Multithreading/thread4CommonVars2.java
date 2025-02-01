package Multithreading;

public class thread4CommonVars2 {

    public static int value = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> print());
        t1.start();
        t1.join();

        Thread t2 = new Thread(() -> print());
        t2.start();
        //t2.join();

        Thread t3 = new Thread(() -> print());
        t3.start();
        //t3.join();
    }

    public static void print() {
        int i = 5;
        System.out.println(i);
        i += value++;
        System.out.println(Thread.currentThread().getName() + " - " + i);
    }
}
