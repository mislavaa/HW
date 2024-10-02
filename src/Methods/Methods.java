package Methods;

public class Methods {
    static int square(int number) {
        return number * number;
    }

    static String printFullName(String firstName, String secondName) {
        return "Full name: " + firstName + " " + secondName;
    }

    static String[] cornerValuesArray(String[] array) {
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
}
