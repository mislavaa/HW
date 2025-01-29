package Multithreading;

public class thread8 {
    // несколько потоков записывают значение -- блокировка
    private Object lock = new Object();

    public void doMethod() {
        // some else
        synchronized (lock) {
            // только этот блок кода синхронизирован
        }
        // some else
    }

    public synchronized void doMethod1() {
        // весь код синхронизирован
    }

    public void doMethod2() {
        // без объекта
        synchronized (this) {
            // только этот блок кода синхронизирован
        }
        // some else
    }

}
