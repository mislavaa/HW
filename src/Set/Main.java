package Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1 задание
        int[] numbersArray = {1, 2, 3, 2, 1, 4};
        System.out.println(getUniqueElements(numbersArray));

        // 2 задание
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println(getOrderedUniqueElements(words));

        // 3 задание
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;
        System.out.println(Arrays.toString(findClosestNumbers(numbers, target)));
    }

    /**
     * Находит уникальные элементы в массиве
     * @param numbers массив целых чисел
     * @return список уникальных чисел
     */
    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        for (int number : numbers) {
            result.add(number);
        }
        return result;
    }

    /**
     * Возвращает уникальные строки в порядке их появления
     * @param words массив строк
     * @return упорядоченный список уникальных строк
     */
    public static Set<String> getOrderedUniqueElements(String[] words) {
        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        return result;
    }

    /**
     * Возвращает ближайшие меньший и больший элементы из массива по указанному числу
     * @param numbers массив целых чисел
     * @param target число-цель
     * @return массив из двух чисел: ближайшее меньшее и большее
     */
    public static Integer[] findClosestNumbers(int[] numbers, int target) {
        Integer[] result = new Integer[2];
        TreeSet<Integer> closetNumbers = new TreeSet<>();
        for (int number : numbers) {
            closetNumbers.add(number);
        }
        result[0] = closetNumbers.lower(target);
        result[1] = closetNumbers.higher(target);
        return result;
    }
}
