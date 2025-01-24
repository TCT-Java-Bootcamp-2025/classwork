package class4;

public class Library {

    static Item[] items = new Item[10];

    public static void main(String[] args) {
        initializeItem();
        printItems();
        borrowBook("Book5");
        printItems();
        borrowBook("Book");
        printItems();
        borrowBook("Book5");
        printItems();
        returnBook("Book5");
        printItems();
    }


    private static void borrowBook(String title) {
        try {
            for (int i = 0; i < 10; i++) {
                if (items[i].getTitle().equals(title)) {
                    if (items[i].getAvailable()) {
                        items[i].setAvailable(false);
                        System.out.println("Book was successfully borrowed!");
                        return;
                    } else
                        throw new BookNotAvailableException("Book was already borrowed!");
                }
            }
            System.out.println("Book not found!");

        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void returnBook(String title) {
        int index = getBookIndex(title);

        if (index == -1 || items[index].getAvailable())
            throw new InvalidReturnException("Book was already returned is not part of our library!");

        items[index].setAvailable(true);
        System.out.println("Book was successfully returned");

    }

    private static int getBookIndex(String title) {
        for (int i = 0 ; i < 10; i++){
            if (items[i].getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }


    private static void initializeItem() {
        for (int i = 0; i < 5; i++) {
            items[i] = new Magazine(1 + i, "Magazine" + i, true);
        }
        for (int i = 5; i<10; i++)
        {
            items[i]= new Book ("Book" + i, "Author" + i, true);
        }
    }

    private static void printItems() {
        for (int i = 0; i < 10; i++) {
            System.out.println(items[i]);
        }
    }


}
