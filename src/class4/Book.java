package class4;

public class Book extends Item{

    private String author;

    public Book(String title, String author, boolean isAvailable) {
        super(title,isAvailable);
        this.author = author;
    }

    public Book() {
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
                "title='" + super.getTitle() + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + super.getAvailable() +
                '}';
    }
}
