package String;

public class HW_15_16 {
    public static void main(String[] args) {
        String text = "Java JAVA 12340 567";
        int lowerLetterCount = 0;
        int upperLetterCount = 0;
        int numberCount04 = 0;
        int numberCount59 = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                ++lowerLetterCount;
            } else if (Character.isUpperCase(text.charAt(i))) {
                ++upperLetterCount;
            }
            if (Character.isDigit(text.charAt(i))) {
                if (text.charAt(i) <= '4' && text.charAt(i) >= '0') {
                    ++numberCount04;
                } else if (text.charAt(i) <= '9' && text.charAt(i) >= '5') {
                    ++numberCount59;
                }
            }
        }
        System.out.println("Количество прописных букв: " + upperLetterCount);
        System.out.println("Количество строчных букв: " + lowerLetterCount);
        System.out.println("Количество цифр от 0 до 4: " + numberCount04);
        System.out.println("Количество цифр от 5 до 9: " + numberCount59);
    }
}
