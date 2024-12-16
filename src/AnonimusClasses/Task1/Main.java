package AnonimusClasses.Task1;

public class Main {
    public static void main(String[] args) {
        // 1. Реализация своего интерфейса

        // Первый способ - переопределение метода
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print("1 сообщение");

        // Второй способ - использование лямбда-выражений
        Printer printer1 = m -> System.out.println(m);
        printer1.print("2 сообщение");

        // Третий способ - лямбда-выражение с дополнением
        Printer printer2 = m -> {
            System.out.print(m + ". ");
            System.out.println("Длина сообщения - " + m.length());
        };
        printer2.print("3 сообщение");
    }
}
