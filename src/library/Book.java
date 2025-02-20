package library;

public class Book {

    private Integer idBooks;
    private String title;
    private Boolean isAvailable;
    private String author;

    public Book() {
    }

    public Book(String title, Boolean isAvailable, String author) {
        this.title = title;
        this.isAvailable = isAvailable;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isAvailable=" + isAvailable +
                ", author='" + author + '\'' +
                '}';
    }
}
