package Map.HW47_48.HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1 задание
        String str = "java is fun and java is powerful";

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                charMap.put(str.charAt(i), charMap.getOrDefault(str.charAt(i), 0) + 1);
            }
        }
        System.out.println(charMap);

        System.out.println("Есть ли в строке уникальные символы - " + hasUnique(charMap));
        System.out.println("Среднее количество символов - " + countSymbolAverage(charMap));

        // 2 задание
        String sentence = "!!! Java is Fun and java IS powerful !!!";
        sentence = sentence.toLowerCase().replaceAll("[^a-zа-я\\s]", "");
        String[] wordArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordArray));

        Map<String, Integer> stringMap = new TreeMap<>();

        for (String word : wordArray) {
            if (!Objects.equals(word, "")) {
                stringMap.put(word, stringMap.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println(stringMap);
    }

    /**
     * Проверяет, есть ли уникальные буквы в строке
     * @param map Map с ключом типа Character, значением типа Integer
     * @return true, если в строке есть уникальные буквы
     */
    public static boolean hasUnique(Map<Character, Integer> map) {
        boolean isUnique = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                isUnique = true;
                break;
            }
        }
        return isUnique;
    }

    /**
     * Подсчитывает среднее количество символов
     * @param map Map с ключом типа Character, значением типа Integer
     * @return среднее количество символов
     */
    public static double countSymbolAverage(Map<Character, Integer> map) {
        double countSymbol = 0;
        for (Integer value : map.values()) {
            countSymbol = countSymbol + value;
        }
        return countSymbol / map.size();
    }
}
