package Comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Вук", "Вельш корги-пемброк");
        Dogs dog2 = new Dogs("Лила", "Вельш корги-пемброк");
        Dogs dog3 = new Dogs("Малыш", "Джек-рассел-терьер");
        Dogs dog4 = new Dogs("Бетти", "Миттельшнауцер");
        Dogs dog5 = new Dogs("Ади", "Доберман");
        Dogs dog6 = new Dogs("Микки", "Метис");

        List<Dogs> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);

        System.out.println("Исходный список: " + dogs);

        dogs.sort(new DogsNameBreedComparator());
        System.out.println("Сортировка по имени: " + dogs);

        dogs.sort(new DogsBreedReverseNameComparator());
        System.out.println("Сортировка по породе в обратном порядке: " + dogs);
    }
}
