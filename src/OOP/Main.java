package OOP;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setAuthorName("Александр");
        author1.setAuthorSurname("Пушкин");
        System.out.println(author1.printAuthorFullName());

        Author author2 = new Author();
        author2.setAuthorName("Николай");
        author2.setAuthorSurname("Гоголь");
        System.out.println(author2.printAuthorFullName());

        Book book1 = new Book();
        book1.setAuthorFullName(author1);
        book1.setBookTitle("Сказка о золотой рыбке");
        book1.setBookPublicationYear(1952);
        System.out.println(book1.printBookInformation());

        Book book2 = new Book();
        book2.setAuthorFullName(author2);
        book2.setBookTitle("Шинель");
        book2.setBookPublicationYear(2018);
        System.out.println(book2.printBookInformation());
    }
}