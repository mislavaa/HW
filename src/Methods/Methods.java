package Methods;

public class Methods {
    /**
     * Находит квадрат числа.
     * @param number число
     * @return квадрат числа
     */
    static int square(int number) {
        return number * number;
    }

    /**
     * Выводит полное имя.
     * @param firstName имя
     * @param secondName фамилия
     * @return полное имя
     */
    static String printFullName(String firstName, String secondName) {
        return "Full name: " + firstName + " " + secondName;
    }

    /** Ищет строки с минимальным и максимальным количеством символов.
     *
     * @param array массив строк
     * @return массив с самой короткой и самой длиной строками из исходного массива
     */
    static String[] cornerValuesArray(String... array) {
        if (array.length == 0) {
            return new String[]{"null", "null"};
        }
        String min = array[0];
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];
            } else if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        return new String[]{min, max};
    }

    /**
     * Ищет наибольшее и наименьшее число.
     * @param numberArray varargs с переменными типа int для поиска наименьшего и наибольшего числа
     * @return наименьшее и наибольшее число
     */
    static int[] cornerValuesArray(int... numberArray) {
        if (numberArray.length == 0) {
            return new int[]{0, 0};
        }
        int[] cornerValue = new int[]{numberArray[0], numberArray[0]};
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < cornerValue[0]) {
                cornerValue[0] = numberArray[i];
            } else if (numberArray[i] > cornerValue[1]) {
                cornerValue[1] = numberArray[i];
            }
        }
        return cornerValue;
    }

    /**
     * Ищет самый маленький и самый большой символ.
     * @param symbolArray varargs с переменными типа char для поиска самого маленького и самого большого символа
     * @return самый мальнький и самый большой символы
     */
    static char[] cornerValuesArray(char... symbolArray) {
        if (symbolArray.length == 0) {
            return new char[]{'0', ' ', '0'};
        }
        char[] cornerValue = new char[]{symbolArray[0], ' ', symbolArray[0]};
        for (int i = 0; i < symbolArray.length; i++) {
            if (symbolArray[i] < cornerValue[0]) {
                cornerValue[0] = symbolArray[i];
            } else if (symbolArray[i] > cornerValue[2]) {
                cornerValue[2] = symbolArray[i];
            }
        }
        return cornerValue;
    }

    /**
     * Находит факториал числа.
     * @param n число
     * @return факториал числа
     */
    static int factorial(int n) {
        if (n < 0) {
            return n;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
