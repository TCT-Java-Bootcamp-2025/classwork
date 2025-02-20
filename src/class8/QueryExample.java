package class8;

import java.sql.*;

public class QueryExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String password = "root";

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM books")
        ) {

            String sql = "SELECT * FROM students WHERE age > ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, 18);
            ResultSet rs = pstmt.executeQuery();


            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "   " + resultSet.getString(3));
                System.out.println("Book: " + resultSet.getString("title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}