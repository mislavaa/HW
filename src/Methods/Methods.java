package Methods;

public class Methods {
    /**
     * Находит квадрат числа.
     * @param number переменная типа int
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
        String min = array[0];
        String max = array[0];
        String[] arrayWithMinMaxStrings = new String[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];
            }
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        arrayWithMinMaxStrings[0] = min;
        arrayWithMinMaxStrings[1] = max;
        return arrayWithMinMaxStrings;
    }

    /**
     * Ищет наибольшее и наименьшее число.
     * @param numberArray varargs с переменными типа int для поиска наименьшего и наибольшего числа
     * @return наименьшее и наибольшее число
     */
    static String cornerValuesArray(int... numberArray) {
        int min = numberArray[0];
        int max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < min) {
                min = numberArray[i];
            }
            if (numberArray[i] > max) {
                max = numberArray[i];
            }
        }
        return "Минимальное число: " + min + ", " + "максимальное число: " + max;
    }

    /**
     * Ищет самый маленький и самый большой символ.
     * @param symbolArray varargs с переменными типа char для поиска самого маленького и самого большого символа
     * @return самый мальнький и самый большой символы
     */
    static String cornerValuesArray(char... symbolArray) {
        char min = symbolArray[0];
        char max = symbolArray[0];
        for (int i = 0; i < symbolArray.length; i++) {
            if (symbolArray[i] < min) {
                min = symbolArray[i];
            }
            if (symbolArray[i] > max) {
                max = symbolArray[i];
            }
        }
        return "Самый маленький символ: " + "'" + min + "'" + ", " + "самый большой символ: " + "'" + max + "'";
    }
}
