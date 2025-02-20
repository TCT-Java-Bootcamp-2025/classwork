package class9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SafePreparedStatementExample {
    public static void main(String[] args) {
        try (Connection conn = ConnectionManager.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your username: ");
            String userInput = scanner.nextLine();

            // SAFE: Using PreparedStatement with placeholders (?)
            String query = "SELECT * FROM users WHERE name = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, userInput);  // Safe parameterized query
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    System.out.println("Login Successful! Welcome " + rs.getString("name"));
                } else {
                    System.out.println("Invalid username or password.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

