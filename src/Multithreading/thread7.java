package Multithreading;

public class thread7 {
    public volatile static int value;

    // volatile записывает значение только 1 поток!
    public static void main(String[] args) {

        Thread reader = new Thread(() -> {
            int temp = 0;
            while (true) {
                if (temp != value) {
                    temp = value;
                    System.out.println("read value = " + temp);
                }
            }
        });
        reader.setDaemon(true);

        Thread writer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                value++;
                System.out.println("value updated: " + value);
                try {
                    Thread.sleep(500); // + try-catch
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            // Немного ждём
            try {
                Thread.sleep(5000); // + try-catch
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        reader.start();
        writer.start();
    }
}
