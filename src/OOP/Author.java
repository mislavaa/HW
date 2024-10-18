package OOP;

public class Author {
    private String authorName;
    private String authorSurname;

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String printAuthorFullName() {
        return authorName + " " + authorSurname;
    }
}
