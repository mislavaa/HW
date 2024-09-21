package String;

public class HW_15_16_2 {
    public static void main(String[] args) {
        String text = "I like Java!!!";
        System.out.println("Последний символ в строке: '" + text.charAt(text.length()-1) + "'");
        if (text.endsWith("!!!")) {
            System.out.println("Строка заканчивается на '!!!'");
        } else {
            System.out.println("Строка не заканчивается на '!!!'");
        }
        if (text.startsWith("I like")) {
            System.out.println("Строка начинается с 'I like'");
        } else {
            System.out.println("Строка не начинается с 'I like'");
        }
        if (text.contains("Java")) {
            System.out.println("Строка содержит подстроку 'Java'");
        } else {
            System.out.println("Строка не содержит подстроку 'Java'");
        }
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j <= text.length(); j++) {
                if (j >= i) {
                    String substring = text.substring(i, j);
                    if (substring.equalsIgnoreCase("Java")) {
                        System.out.println("Позиция подстроки 'Java': " + i + " - " + j);
                    }
                }
            }
        }
        String replacedLetter = text.replace("a", "o");
        System.out.println("Замена 'а' на 'о': " + replacedLetter);
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
    }
}