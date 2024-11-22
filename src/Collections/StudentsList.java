package Collections;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // Добавление студентов:
        students.add("Alex");
        students.add("Tony");
        students.add("Andy");
        students.add("Fred");
        students.add("Pam");
        System.out.println(students);

        List<String> students2 = new ArrayList<>();
        students2.add("Jim");
        students2.add("Anna");
        students2.add("David");
        System.out.println(students2);

        students.addAll(students2);
        System.out.println("Объединение списков 1 и 2 - " + students);

        // Удаление студентов:
        students.remove("Andy");
        System.out.println("Remove Andy - " + students);

        students.remove(5);
        System.out.println("Remove index 5 (Anna) - " + students);

        // Проверка студентов:
        System.out.println("Есть ли в списке David - " + students.contains("David"));

        List<String> students3 = new ArrayList<>();
        students3.add("David");
        students3.add("Jim");
        students3.add("Tony");

        System.out.println("Совпадают ли списки 1 и 2 - " + students.containsAll(students2));
        System.out.println("Совпадают ли списки 1 и 3 - " + students.containsAll(students3));

        // Получение размера, isEmpty():
        System.out.println("Размер списка - " + students.size());
        System.out.println("Пустой ли список - " + students.isEmpty());

        // Удаление всех элементов списка:
        students.clear();
        System.out.println(students);
        System.out.println("Пустой ли список - " + students.isEmpty());
    }
}