package OOP;

import java.time.LocalDate;

public class Book {
    private String bookTitle;
    private Integer bookPublicationYear;
    private Author authorFullName;

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookPublicationYear(Integer bookPublicationYear) {
        if (bookPublicationYear <= LocalDate.now().getYear() && bookPublicationYear > 0) {
            this.bookPublicationYear = bookPublicationYear;
        } else {
            System.out.println("Year out of range");
        }
    }

    public void setAuthorFullName(Author authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Integer getBookPublicationYear() {
        return bookPublicationYear;
    }

    public Author getAuthorFullName() {
        return authorFullName;
    }

    public String printBookInformation() {
        return "'" + bookTitle + "'" + " " + bookPublicationYear + " год " + authorFullName.printAuthorFullName();
    }
}
