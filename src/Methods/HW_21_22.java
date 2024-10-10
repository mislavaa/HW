package Methods;

import java.util.Arrays;
import java.util.Random;

public class HW_21_22 {
    public static void main(String[] args) {
        Random random = new Random();
        int squaredNumber = random.nextInt(-100, 101);
        System.out.println("Квадрат числа " + squaredNumber + " = " + Methods.square(squaredNumber));

        System.out.println(Methods.printFullName("Tony", "Stark"));

        String[] searchMinMaxStringInArray = {"value", "arrays", "str", "sc", "numbers"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(searchMinMaxStringInArray)));

        int[] searchMinMaxNumberInArray = {1, 2, 3, 4, -5, 16, -1000, 0, 23};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(searchMinMaxNumberInArray)));

        char[] searchMinMaxSymbolInArray = {'v', '=', 's', 'c', 'n'};
        System.out.println(Methods.cornerValuesArray(searchMinMaxSymbolInArray));

        System.out.println(Arrays.toString(Methods.cornerValuesArray("java", "top", "arrays", "hello", "in")));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(2, 3, 16, 13, 23, 0)));
        System.out.println(Methods.cornerValuesArray('a', '-', '5', '！', '@'));

        // corner cases
        String[] searchMinMaxStringInArray1 = {};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(searchMinMaxStringInArray1)));

        int[] searchMinMaxNumberInArray1 = {};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(searchMinMaxNumberInArray1)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(-2, -3, -16, -13, -23)));

        char[] searchMinMaxSymbolInArray1 = {};
        System.out.println(Methods.cornerValuesArray(searchMinMaxSymbolInArray1));
        System.out.println(Methods.cornerValuesArray('р', '我', 'и', '+', ','));

        // факториал
        System.out.println(Methods.factorial(7));
        System.out.println(Methods.factorial(0));
        System.out.println(Methods.factorial(-5));
    }
}