package OOP.HW;

import java.time.LocalDate;

public class Book {
    private String title;
    private Integer publicationYear;
    private Author authorFullName;

    public Book() {
    }

    public Book(String title, Integer publicationYear, Author fullName) {
        this.title = title;
        setPublicationYear(publicationYear);
        this.authorFullName = fullName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(Integer publicationYear) {
        if (publicationYear <= LocalDate.now().getYear() && publicationYear > 0) {
            this.publicationYear = publicationYear;
        } else {
            System.out.println("Year out of range");
        }
    }

    public void setAuthorFullName(Author authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthorFullName() {
        return authorFullName;
    }

    @Override
    public String toString() {
        return "'" + title + "'" + " " + publicationYear + " год " + authorFullName;
    }
}
