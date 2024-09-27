package String;

public class Palindrome {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        // a. С помощью СтрингБилдера.
        String st = "rttr";
        StringBuilder sb = new StringBuilder();
        for (int i = st.length(); i > 0; i--) {
            sb.append(st.charAt(i - 1));
        }
        if (st.equalsIgnoreCase(sb.toString())) {
            System.out.println(st + " - палиндром");
        } else {
            System.out.println(st + " - не палиндром");
        }
    }

    static void task2() {
        // b. Анализировать посимвольно строку.
        String st = "qw5wq";
        String message = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            if (st.charAt(i) == st.charAt(st.length() - i - 1)) {
                message = " - палиндром";
            } else {
                message = " - не палиндром";
                break;
            }
        }
        System.out.println(st + message);
    }

    static void task3() {
        // с. Проверить число на палиндром.
        int numberPalindrome = 1234321;
        String message = "";
        String result = Integer.toString(numberPalindrome);
        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) == result.charAt(result.length() - i - 1)) {
                message = " - число палиндром";
            } else {
                message = " - число не палиндром";
                break;
            }
        }
        System.out.println(numberPalindrome + message);
    }
}