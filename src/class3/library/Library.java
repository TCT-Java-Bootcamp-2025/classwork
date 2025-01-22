package class3.library;

public class Library {

    static Book[] books = new Book[10];

    public static void main(String[] args) {
        initializeBooks();
        printBooks();
        borrowBook("Book2");
        printBooks();
        borrowBook("Book");
        printBooks();
        borrowBook("Book2");
        printBooks();
    }

    private static void borrowBook(String title) {
        for(int i = 0; i<10; i++) {
            if(books[i].getTitle().equals(title)){
                if(books[i].isAvailable()) {
                    books[i].setAvailable(false);
                    System.out.println("Book was successfully borrowed!");
                    return;
                } else
                    throw new BookNotAvailableException("Book was already borrowed!");
            }
        }
        System.out.println("Book not found!");
    }

    private static void initializeBooks() {
        for(int i = 0; i<10; i++) {
            books[i] = new Book("Book" + i, "Author" + i, true);
        }
    }

    private static void printBooks(){
        for(int i = 0; i<10; i++) {
            System.out.println(books[i]);
        }
    }
}
