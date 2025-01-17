package class2.encapsulation;

import class2.abstraction.Circle;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();

//        System.out.println(bankAccount.balance()); //balance is private


        System.out.println("Initial balance is: " + bankAccount1.getBalance());
        bankAccount1.deposit(10);
        System.out.println("Balance after $10.00 deposit: " + bankAccount1.getBalance());


        BankAccount bankAccount2 = new BankAccount();
        System.out.println("Initial balance for account 1 is: " + bankAccount2.getBalance());

        bankAccount1.transfer(bankAccount2, 2);

        System.out.println("Account 1 after transfer: " + bankAccount1.getBalance());
        System.out.println("Account 2 after transfer: " + bankAccount2.getBalance());


        bankAccount1.transfer(bankAccount2, 800);
        System.out.println("Account 1 after transfer: " + bankAccount1.getBalance());
        System.out.println("Account 2 after transfer: " + bankAccount2.getBalance());


    }
}
