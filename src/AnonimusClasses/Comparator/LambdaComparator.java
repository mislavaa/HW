package AnonimusClasses.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        // 2. Сортировка списка строк с использованием Comparator

        List<String> names = Arrays.asList("Tom", "Jerry", "Snoopy", "Aladdin", "Maik");
        System.out.println("Исходный список - " + names);

        Collections.sort(names, (n1, n2) -> n2.compareTo(n1));
        System.out.println("Сортировка с помощью лямбда-выражения - " + names);

        Comparator<String> sortNames = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        names.sort(sortNames);
        System.out.println("Сортировка с помощью анонимного класса - " + names);
    }
}
