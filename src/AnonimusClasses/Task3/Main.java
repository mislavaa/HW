package AnonimusClasses.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 3. Сортировка списка объектов с использованием Comparator

        Dogs dog1 = new Dogs("Вук", 3);
        Dogs dog2 = new Dogs("Лила", 5);
        Dogs dog3 = new Dogs("Бетти", 2);
        Dogs dog4 = new Dogs("Малыш", 9);
        Dogs dog5 = new Dogs("Микки", 5);
        Dogs dog6 = new Dogs("Малыш", 7);

        List<Dogs> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);

        System.out.println("Исходный список: " + dogs);

        dogs.sort((d1, d2) -> {
            if (Integer.compare(d1.getName().length(), d2.getName().length()) == 0) {
                return Integer.compare(d1.getAge(), d2.getAge());
            } else {
               return Integer.compare(d1.getName().length(), d2.getName().length());
            }
        });
        System.out.println("Сортировка по количеству символов в имени - " + dogs);


        dogs.sort((d1, d2) -> {
            if (d2.getName().compareTo(d1.getName()) == 0) {
                return Integer.compare(d1.getAge(), d2.getAge());
            } else {
                return d2.getName().compareTo(d1.getName());
            }
        });
        System.out.println("Сортировка по имени в обратном порядке - " + dogs);
    }
}
