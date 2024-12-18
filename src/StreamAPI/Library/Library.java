package StreamAPI.Library;

import java.util.*;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<Integer, Book> books) {
        this.books = books;
    }

    /**
     * Добавляет книгу в библиотеку
     * @param book книга
     */
    public void addBook(Book book) {
        this.books.put(book.getId(), book);
    }

    /**
     * Находит книгу по ID
     * @param id ID книги
     * @return книгу
     */
    public Book findBook(int id) {
        return this.books.get(id);
    }

    /**
     * Находит доступные/недоступные книги
     * @param isAvailable true/false
     * @return список доступных/недоступных книг
     */
    public List<Book> findBook(boolean isAvailable) {
        return books.values().stream()
                .filter(b -> b.isAvailable() == isAvailable)
                .toList();
    }

    /**
     * Сортирует книги
     * @param comparator параметры сортировки
     * @return список отсортированных книг
     */
    public List<Book> sortBook(Comparator<Book> comparator) {
        return books.values().stream()
                .sorted(comparator).
                toList();
    }

    /**
     * Сортирует книги по названию
     * @return список отсортированных книг
     */
    public List<Book> sortBooks() {
        return books.values().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .toList();
    }

    /**
     * Подсчитывает количество книг в библиотеке
     * @return количество книг
     */
    public long countBooks() {
        return books.values().size();
    }

    /**
     * Подсчитывает количество доступных/недоступных книг в библиотеке
     * @param isAvailable true/false
     * @return количество доступных/недоступных книг
     */
    public long countBooks(boolean isAvailable) {
        return books.values().stream()
                .filter(b -> b.isAvailable() == isAvailable)
                .count();
    }

    /**
     * Создаёт отсортированный список авторов без повторов
     * @return отсортированный список авторов
     */
    public List<String> getAuthors() {
        return books.values().stream()
                .map(Book::getAuthor)
                .sorted(String::compareTo)
                .distinct()
                .toList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }

    @Override
    public String toString() {
        return "Library - " + books;
    }
}
