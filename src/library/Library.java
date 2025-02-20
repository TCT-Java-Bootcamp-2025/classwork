package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Library {

    static Book[] items = new Book[10];

    public static void main(String[] args) {

        try (Connection conn = ConnectionManager.getConnection())  {
            insertBook(conn, "Author_test", "Book_test");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //UPDATE books
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

    //UPDATE book
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


    //INSERT book
    private static void insertBook(Connection conn, String author, String title) throws SQLException {
       String query = "INSERT INTO books (author, title, is_available) VALUES (?, ?, true)";
       PreparedStatement prSt = conn.prepareStatement(query);
       prSt.setString(1, author);
       prSt.setString(2,title);
       int insertedRows = prSt.executeUpdate();
        if (insertedRows==1){
     System.out.println(insertedRows + " book inserted into library");
}
    }

    //SELECT
    private static void printItems() {
        for (int i = 0; i < 10; i++) {
            System.out.println(items[i]);
        }
    }

    //DELETE


}
