package class2.encapsulation;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    //TODO: Create withdraw and transfer between accounts methods. Keep in mind we can't have a negative balance

}

