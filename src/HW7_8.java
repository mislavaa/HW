import javax.swing.*;
import java.util.Random;

public class HW7_8 {
    public static void main(String[] args) {
// Random
        Random random = new Random();
        int a = random.nextInt(65, 90);
        int b = random.nextInt(65, 90);
        int c = random.nextInt(65, 90);
        int d = random.nextInt(65, 90);
        char myChar1 = (char) a;
        char myChar2 = (char) b;
        char myChar3 = (char) c;
        char myChar4 = (char) d;
        System.out.print("Символы: " + myChar1 + myChar2 + myChar3 + myChar4);

// переполнение типа int
        System.out.println("\nПереполнение типа int: ");
        long myLong = 5_000_000_000_000L;
        int myInt = (int) myLong;
        System.out.println("myLong: " + myLong);
        System.out.println("Переполненный int: " + myInt);
    }
}