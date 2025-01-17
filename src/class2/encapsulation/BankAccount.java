package class2.encapsulation;

public class BankAccount {
    private double balance;
    private final double DAILY_LIMIT = 500;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }



    //TODO: Create withdraw method

    public boolean withdraw(double amount) {

        if(amount > balance){
            System.out.println("ERROR!! You are trying to withdraw a big amount that you don't have!");
            return false;
        } else if (amount > DAILY_LIMIT) {
            System.out.println("You have reached your limit");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public void transfer(BankAccount account, double amount) {
        boolean success = withdraw(amount);

        if(success) {
            account.deposit(amount);
        }
    }

    // and transfer between accounts methods.
    // Keep in mind we can't have a negative balance

}

