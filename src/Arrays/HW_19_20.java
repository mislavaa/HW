package Arrays;

import java.util.Arrays;

public class HW_19_20 {
    public static void main(String[] args) {
        findArithmeticMean();
        findMinMax();
        findVowelCount();
        convertStringToArray();
        task5();
    }

    static void findArithmeticMean() {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int arr : array) {
            sum += arr;
        }
        System.out.println("Среднее значение: " + sum / array.length);
    }

    static void findMinMax() {
        double[] arr = {3.5, 5.2, -1.4, 7.8, 2.2};
        double min = arr[0];
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min + ", максимальное значение: " + max);
    }

    static void findVowelCount() {
        char[] chars = {'a', 'B', 'i', 't', 'E', 'r'};
        char[] checkArray = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (Character.toLowerCase(chars[i]) == checkArray[j]) {
                    vowelCount += 1;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelCount);
    }

    static void convertStringToArray() {
        String str = "Hello World This is Java";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                arr[i] = '_';
            }
        }
        System.out.println(arr);
    }

    static void task5() {
        String str = "apple,banana,grape,orange";
        String[] arr = str.split(",");
        System.out.println(Arrays.toString(arr));

    }
}
