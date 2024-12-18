package Repeat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"};
        for (String password : passwords) {
            System.out.println("Пароль " + password + " - " + checkPassword(password));
        }
    }

    /**
     * Проверяет пароль
     * @param password пароль
     * @return описание пароля
     */
    public static List<String> checkPassword(String password) {
        List<String> message = new ArrayList<>();
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        if (password.length() < 8 || password.length() > 20) {
            message.add("Пароль должен быть от 8 до 20 символов");
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == ' ') {
                message.add("не должен содержать пробелы");
            }
            if (Character.isLowerCase(password.charAt(i))) {
                countLower++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                countUpper++;
            }
            if (Character.isDigit(password.charAt(i))) {
                countDigit++;
            }
        }
        if (countLower < 1) {
            message.add("должен содержать хотя бы одну строчную букву");
        }
        if (countUpper < 1) {
            message.add("должен содержать хотя бы одну заглавную букву");
        }
        if (countDigit < 1) {
            message.add("должен содержать хотя бы одну цифру");
        }
        if (message.isEmpty()) {
            message.add("Надёжный пароль");
            return message;
        }
        return message;
    }
}
