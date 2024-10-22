package OOP;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        System.out.println(author1);

        Author author2 = new Author("Николай", "Гоголь");
        System.out.println(author2);

        Book book1 = new Book("Сказка о золотой рыбке", 1952, author1);
        System.out.println(book1);
        book1.setTitle("Сказка о царе Салтане");
        book1.setPublicationYear(1980);
        System.out.println(book1);
        System.out.println("Вывод с помощью геттеров: " + book1.getTitle() + " " + book1.getPublicationYear() + " " + book1.getAuthorFullName());

        Book book2 = new Book("Шинель", 2018, author2);
        System.out.println(book2);
        book2.setAuthorFullName(new Author("Н.В.", "Гоголь"));
        System.out.println(book2);
        System.out.println("Вывод с помощью геттеров: " + book2.getTitle() + " " + book2.getPublicationYear() + " " + book2.getAuthorFullName());
    }
}