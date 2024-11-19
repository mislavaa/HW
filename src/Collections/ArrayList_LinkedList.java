package Collections;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayList_LinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new LinkedList<>();

        System.out.println("Время выполнения ArrayList - " + time(numbers));
        System.out.println("Время выполнения LinkedList - " + time(numbers1));

        System.out.println("Время выполнения ArrayList - " + getElement(numbers));
        System.out.println("Время выполнения LinkedList - " + getElement(numbers1));
    }

    public static long time(List<Integer> numbers) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i);
        }

        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);

        return time.toMillis();
    }

    public static long getElement(List<Integer> numbers) {
        LocalTime startTime = LocalTime.now();
        Random rand = new Random();
        for (int i = 0; i <= 100_000; i++) {
            numbers.get(rand.nextInt(0, 1_000_000));
        }
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);

        return time.toMillis();
    }
}