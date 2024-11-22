package Arrays;

import java.util.Arrays;

public class DoubleArrays {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = number;
                number++;
            }
        }

        for (int[] arrays : array) {
            System.out.println(Arrays.toString(arrays));
        }

        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Сумма строки " + (i + 1) + ": " + rowSum);
        }

        for (int i = 0; i < array[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < array.length; j++) {
                columnSum += array[j][i];
            }
            System.out.println("Сумма столбца " + (i + 1) + ": " + columnSum);
        }

        int[] checkArray = new int[]{1, 2, 3, 2, 3, 1};
        System.out.println("Исходный массив: " + Arrays.toString(checkArray));

        changeArray(checkArray);
        System.out.println("После изменения исходного: " + Arrays.toString(checkArray));

        changeCopyArray(checkArray);
        System.out.println("После изменения копии: " + Arrays.toString(checkArray));
    }

    /**
     * Сортирует исходный масиив.
     * @param array массив int
     */
    static void changeArray(int[] array) {
        Arrays.sort(array);

    }

    /**
     * Копирует исходный массив и заполняет копию 9.
     * @param array массив int
     */
    static void changeCopyArray(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.fill(copyArray, 9);
    }
}