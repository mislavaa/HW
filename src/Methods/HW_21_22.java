package Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_21_22 {
    public static void main(String[] args) {
        Random random = new Random();
        int squaredNumber = random.nextInt(-100, 101);
        System.out.println("Квадрат числа " + squaredNumber + " = " + Methods.square(squaredNumber));

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        System.out.print("Введите фамилию: ");
        String surname = sc.nextLine();
        System.out.println(Methods.printFullName(name, surname));

        String[] searchMinMaxStringInArray = {"value", "arrays", "str", "sc", "numbers"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(searchMinMaxStringInArray)));

        char[] searchMinMaxSymbolInArray = {'v', '=', 's', 'c', 'n'};
        System.out.println(Methods.cornerValuesArray(searchMinMaxSymbolInArray));

        int[] searchMinMaxNumberInArray = {1, 2, 3, 4, -5, 16, -1000, 0, 23};
        System.out.println(Methods.cornerValuesArray(searchMinMaxNumberInArray));

        System.out.println(Methods.cornerValuesArray(2, 3, 16, 13, 23, 0));
        System.out.println(Methods.cornerValuesArray('a', '-', '5', '！', '@'));
        System.out.println(Arrays.toString(Methods.cornerValuesArray("java", "top", "arrays", "hello", "in")));

    }
}