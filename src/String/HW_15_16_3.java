package String;

public class HW_15_16_3 {
    public static void main(String[] args) {
        String text = "string";
        if (text.length() % 2 == 0) {
            String substring = text.substring(text.length()/2-1, text.length()/2+1);
            System.out.println(substring);
        } else {
            System.out.println("Нечётное количество букв");

        }
    }
}
