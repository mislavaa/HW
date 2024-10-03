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
        String firstName = sc.nextLine();
        System.out.print("Введите фамилию: ");
        String secondName = sc.nextLine();
        System.out.println(Methods.printFullName(firstName, secondName));

        String[] arrayToCheck = {"value", "arrays", "str", "sc", "numbers"};
        String[] arrayToCheck1 = {"git", "in", "string"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arrayToCheck)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arrayToCheck1)));

    }
}