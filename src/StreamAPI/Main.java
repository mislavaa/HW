package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 4. Работа со списком через stream api

        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");
        System.out.println(words);

        List<String> newWords = words.stream()
                .filter(w -> w.length() > 4)
                .sorted(Comparator.comparingInt(String::length))
                .map(w -> w.toUpperCase())
                .toList();
        System.out.println(newWords);
    }
}
