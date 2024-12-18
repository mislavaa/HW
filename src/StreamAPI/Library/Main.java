package StreamAPI.Library;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Сказка о рыбаке и рыбке", "А.С. Пушкин", false);
        Book book2 = new Book(2, "ОНО", "С. Кинг", true);
        Book book3 = new Book(3, "Гарри Поттер", "Дж. К. Роулинг", false);
        Book book4 = new Book(4, "Пятый элефант", "Т. Пратчетт", true);
        Book book5 = new Book(5, "Преступление и наказаниие", "Ф. Достоевский", true);
        Book book6 = new Book(6, "Идиот", "Ф. Достоевский", true);
        Book book7 = new Book(7, "Зелёная миля", "С. Кинг", false);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        System.out.println("Исходный список - " + library);

        System.out.println("Сортировка книг по названиям - " + library.sortBooks());

        System.out.print("Книга с id 3 - " + library.findBook(3));
        System.out.print("Книга с id 7 - " + library.findBook(7));
        System.out.println("Книга с id 5 - " + library.findBook(5));

        System.out.println("Доступные книги - " + library.findBook(true));
        System.out.println("Недоступные книги - " + library.findBook(false));

        System.out.println("Количество всех книг - " + library.countBooks());
        System.out.println("Количество доступных книг - " + library.countBooks(true));
        System.out.println("Количество недоступных книг - " + library.countBooks(false));

        System.out.println("Отсортированный список авторов - " + library.getAuthors());

        System.out.println("Сортировка книг по авторам - " + library.sortBook(Comparator.comparing(Book::getAuthor)));
        System.out.println("Сортировка книг по доступности - " + library.sortBook(Comparator.comparing(Book::isAvailable)));
    }
}
