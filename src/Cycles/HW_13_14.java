package Cycles;

public class HW_13_14 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
//      Задача 1. Вывод нечётных чисел от 1 до n
        int n = 10;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void task2() {
//      Задача 2. Произведение чисел от 1 до n
        int n = 4;
        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product * (i + 1);
            System.out.print("\ni - " + (i + 1));
        }
        System.out.println("\nУмножение: " + product);

    }

    static void task3() {
//      Задача 3. Таблица умножения
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i != 0) {
                System.out.println("Таблица умножения на " + i + ": ");
                for (int j = 0; j <= n; j++) {
                    if (j != 0) {
                        System.out.println(i + " * " + j + " = " + (i * j));

                    }
                }


            }


        }
    }
}
