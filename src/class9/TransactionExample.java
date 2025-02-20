package class9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

    public static void main(String[] args) {
        try (Connection conn = ConnectionManager.getConnection()) {

            // Start Transaction - Disable AutoCommit
            conn.setAutoCommit(false); // We now manually control transactions

            // Perform money transfer from Account A to Account B
            boolean success = transferMoney(conn, 1, 2, 500);

            // Commit or Rollback
            if (success) {
                conn.commit(); // Save changes permanently
                System.out.println(" Transaction committed successfully!");
            } else {
                conn.rollback(); // Undo all changes
                System.out.println("Transaction rolled back due to failure.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Transfers money between two accounts.
     * @param conn Database connection
     * @param fromAccountID Sender's account ID
     * @param toAccountID Receiver's account ID
     * @param amount Transfer amount
     * @return true if successful, false otherwise
     */
    private static boolean transferMoney(Connection conn, int fromAccountID, int toAccountID, double amount) {
        String withdrawQuery = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String depositQuery = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (
                PreparedStatement withdrawStmt = conn.prepareStatement(withdrawQuery);
                PreparedStatement depositStmt = conn.prepareStatement(depositQuery)
        ) {
            // Withdraw money from sender
            withdrawStmt.setDouble(1, amount);
            withdrawStmt.setInt(2, fromAccountID);
            int rowsWithdrawn = withdrawStmt.executeUpdate();

            // Deposit money into receiver
            depositStmt.setDouble(1, amount);
            depositStmt.setInt(2, toAccountID);
            int rowsDeposited = depositStmt.executeUpdate();

            // If both operations succeed, return true
            return rowsWithdrawn == 1 && rowsDeposited == 1;

        } catch (SQLException e) {
            System.err.println("Error during transaction!");
            e.printStackTrace();
            return false;
        }
    }
}

