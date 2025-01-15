package class1.encapsulation;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

//        System.out.println(bankAccount.balance()); //balance is private


        System.out.println("Initial balance is: " + bankAccount.getBalance());
        bankAccount.deposit(10);
        System.out.println("Balance after $10.00 deposit: " + bankAccount.getBalance());


        BankAccount bankAccount1 = new BankAccount();
        System.out.println("Initial balance for account 1 is: " + bankAccount1.getBalance());


    }
}
