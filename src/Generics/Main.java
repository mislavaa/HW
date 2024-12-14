package Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> objects = new Box<>("Cat");

        System.out.println(objects.isEmpty());
        System.out.println(objects.getObject());
        objects.set("Dog");
        System.out.println(objects);
        System.out.println(objects.getObject());

        objects.clear();
        System.out.println(objects);
        System.out.println(objects.isEmpty());

        System.out.println();

        Box<Integer> numbers = new Box<>();

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.getObject());

        numbers.set(13);
        System.out.println(numbers);
        System.out.println(numbers.getObject());

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());

    }
}
