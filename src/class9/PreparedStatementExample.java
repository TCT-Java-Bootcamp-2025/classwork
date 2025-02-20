package class9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {

    public static void main(String[] args) {
        // Step 1: Establish a connection to the database
        try (Connection conn = ConnectionManager.getConnection()) {

            // INSERT Operation - Adding a new user
            insertUser(conn, "Alice", "alice@example.com", "password");

            // UPDATE Operation - Updating the user's name
            updateUser(conn, "Alice Johnson", "alice@example.com");

            // DELETE Operation - Removing the user
            deleteUser(conn, "alice@example.com");

            // SELECT Operation - Fetching users from the database
            fetchAllUsers(conn);

        } catch (SQLException e) {
            // Print error details in case of an exception
            System.err.println("Database operation failed!");
            e.printStackTrace();
        }
    }

    /**
     * Inserts a new user into the database.
     * @param conn Database connection
     * @param name User's name
     * @param email User's email
     */
    private static void insertUser(Connection conn, String name, String email, String password) throws SQLException {
        // SQL query with parameter placeholders (?)
        String insertQuery = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        // Use try-with-resources to automatically close PreparedStatement
        try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
            pstmt.setString(1, name);  // Set first parameter (name)
            pstmt.setString(2, email); // Set second parameter (email)
            pstmt.setString(3, password); // Set third parameter (password)

            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);
        }
    }

    /**
     * Updates a user's name in the database.
     * @param conn Database connection
     * @param newName New name for the user
     * @param email User's email to identify the record
     */
    private static void updateUser(Connection conn, String newName, String email) throws SQLException {
        String updateQuery = "UPDATE users SET name = ? WHERE email = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
            pstmt.setString(1, newName); // Set new name
            pstmt.setString(2, email);   // Identify user by email

            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
        }
    }

    /**
     * Deletes a user from the database.
     * @param conn Database connection
     * @param email User's email to identify the record
     */
    private static void deleteUser(Connection conn, String email) throws SQLException {
        String deleteQuery = "DELETE FROM users WHERE email = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
            pstmt.setString(1, email); // Identify user by email

            int rowsDeleted = pstmt.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);
        }
    }

    /**
     * Fetches all users from the database and prints them.
     * @param conn Database connection
     */
    private static void fetchAllUsers(Connection conn) throws SQLException {
        String selectQuery = "SELECT * FROM users";

        try (PreparedStatement pstmt = conn.prepareStatement(selectQuery);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("User Records in Database:");
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userName = rs.getString("name");
                String userEmail = rs.getString("email");

                System.out.println("User ID: " + userId +
                        ", Name: " + userName +
                        ", Email: " + userEmail);
            }
        }
    }
}
