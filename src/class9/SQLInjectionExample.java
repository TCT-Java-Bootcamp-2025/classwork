package class9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjectionExample {

    //' OR '1' = '1
    public static void main(String[] args) {
        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement();
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your username: ");
            String userInput = scanner.nextLine();

            // UNSAFE: Directly concatenating user input
            String query = "SELECT * FROM users WHERE name = '" + userInput + "'";

            System.out.println("Executing query: " + query);

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("Login Successful! Welcome " + rs.getString("name"));
            } else {
                System.out.println("Invalid username or password.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
