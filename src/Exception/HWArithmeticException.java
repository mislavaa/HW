package Exception;

public class HWArithmeticException {
    public static void main(String[] args) {
        System.out.println(divideNumbers(7, 0));
    }

    /**
     * Деление двух чисел
     * @param num1 делимое
     * @param num2 делитель
     * @return частное
     * @throws ArithmeticException ошибка при делении на ноль
     */
    public static int divideNumbers(int num1, int num2) throws ArithmeticException {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка - " + e.getMessage());
            return -1;
        }
    }
}
