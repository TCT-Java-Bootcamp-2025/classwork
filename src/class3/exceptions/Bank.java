package class3.exceptions;

public class Bank {

    public static void main(String[] args) throws InsufficientFundsException {
        double balance = 9;
        double amount = 10;

        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient balance!");
        }
    }
}
