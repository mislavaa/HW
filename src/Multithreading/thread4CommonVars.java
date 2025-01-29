package Multithreading;

public class thread4CommonVars {
    public static void main(String[] args) {
        String message = "Hello";

        Task t1 = new Task(message);
        Task t2 = new Task(message);

        t1.start();
        t2.start();
    }
}

class Task extends Thread {
    private String message;

    public Task(String message) {
        this.message = message;
    }

    public void run() {
        int i = 5;

        i++;
        System.out.println(message + " " + i);
    }
}
