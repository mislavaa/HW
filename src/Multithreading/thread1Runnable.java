package Multithreading;

public class thread1Runnable {
    public static void main(String[] args) throws InterruptedException {
        // создание потока - наследоваться от класса Thread/ имплементировать интерфейс Runnable (лучше)

        System.out.println(Thread.currentThread().getName() + " before");

        Runnable task1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - task1 - " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("   " + Thread.currentThread().getName() + " - task2 - " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(task1);
        t1.setDaemon(true);
        Thread t2 = new Thread(task2);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        /*t1.join();
        t2.join();*/

        // concurrency (конкуренция между потоками)

        Thread.sleep(500);
        System.out.println(Thread.currentThread().getName() + " after");
    }

}
