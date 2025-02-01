package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class thread6 {
    public static void main(String[] args) throws InterruptedException {
        // аномалия гонка потоков

        Test test = new Test();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.incrementWithoutSynchronized();
                test.incrementWithAtomic();
                test.increment();
                //System.out.println(Thread.currentThread().getName() + ": " + i + " - " + test.getCount());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.incrementWithoutSynchronized();
                test.incrementWithAtomic();
                test.increment();
                //System.out.println(Thread.currentThread().getName() + ": " + i + " - " + test.getCount());
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join(); // без join() count - 0

        System.out.println("count without synchronized - " + test.getCountWithoutSynchro());
        System.out.println("count with synchronized - " + test.getCount());
        System.out.println("count with Atomic - " + test.getCountWithAtomic());
    }

    static class Test {
        private int count = 0;
        private int count1 = 0;

        private AtomicInteger count2 = new AtomicInteger(0);

        public synchronized void increment() {
            count++;
            // неатомарная операция - состоит из 3 операций -
            // получить значение переменной (чтение)
            // увеличить на 1 (вычисление)
            // записать новое значение обратно в переменную (запись)
        }
        // 2 способ
        /*public void increment() {
            synchronized (this) {
                count++;
            }
        }*/

        public void incrementWithoutSynchronized() {
            count1++;
        }

        public int getCount() {
            return count;
        }

        public int getCountWithoutSynchro() {
            return count1;
        }

        // 3 способ
        public void incrementWithAtomic() {
            count2.getAndIncrement();
        }

        public int getCountWithAtomic() {
            return count2.get();
        }
    }
}