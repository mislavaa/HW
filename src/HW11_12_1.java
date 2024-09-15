import java.util.Scanner;

public class HW11_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = sc.nextInt();
        String message;
        message = switch (monthNumber) {
            case 1, 2, 12 -> "Сезон зима";
            case 3, 4, 5 -> "Сезон весна";
            case 6, 7, 8 -> "Сезон лето";
            case 9, 10, 11 -> "Сезон осень";
            default -> "Ошибка";
        };
        System.out.print(message);
    }
}
