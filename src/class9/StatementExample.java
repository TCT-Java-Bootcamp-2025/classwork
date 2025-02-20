package class9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
    public static void main(String[] args) {
        // Step 1: Establish a connection to the database
        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {

            /**
             * What is a Statement in JDBC?
             * --------------------------------
             * - A `Statement` is an interface in JDBC used for executing static SQL queries.
             * - It does NOT support parameterized queries.
             * - It is useful for executing simple queries where input is not dynamic.
             * - It can execute SQL commands like SELECT, INSERT, UPDATE, DELETE.
             * - It is prone to **SQL Injection** if user inputs are directly concatenated into queries.
             * - Every execution leads to a **new compilation**, reducing performance.
             */

            // 1. INSERT Operation (Adding a new user)
            // This query is directly concatenated as a string (Not safe for dynamic inputs)
            String insertQuery = "INSERT INTO users (name, email, password) VALUES ('Alice', 'alice@example.com', 'password')";
            int rowsInserted = stmt.executeUpdate(insertQuery);
            System.out.println("Rows inserted: " + rowsInserted);

            // 2. UPDATE Operation (Modifying an existing user's name)
            // This query updates Alice's name in the database.
            String updateQuery = "UPDATE users SET name = 'Alice Johnson' WHERE email = 'alice@example.com'";
            int rowsUpdated = stmt.executeUpdate(updateQuery);
            System.out.println("Rows updated: " + rowsUpdated);
//
            // 3. DELETE Operation (Removing a user from the database)
            // This query removes Alice's record permanently.
            String deleteQuery = "DELETE FROM users WHERE email = 'alice@example.com'";
            int rowsDeleted = stmt.executeUpdate(deleteQuery);
            System.out.println("Rows deleted: " + rowsDeleted);

            // 4. SELECT Operation (Fetching and displaying all users)
            String selectQuery = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("User Records in Database:");
            while (rs.next()) {
                // Fetch each column's value from the result set
                int userId = rs.getInt("id");
                String userName = rs.getString("name");
                String userEmail = rs.getString("email");

                // Display user details
                System.out.println("User ID: " + userId +
                        ", Name: " + userName +
                        ", Email: " + userEmail);
            }

        } catch (SQLException e) {
            // Print error details in case of an exception
            System.err.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}
