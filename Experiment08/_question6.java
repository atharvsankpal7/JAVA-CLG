package Experiment8;

import java.util.Scanner;

//You are tasked with designing a class hierarchy in Java for a simple banking system. The
//hierarchy consists of three classes: BankAccount, SavingsAccount, and
//CheckingAccount.
//The BankAccount class serves as the base class and contains the following attributes:
//accountNumber (integer) - represents the account number
//balance (double) - represents the current balance of the account
//The SavingsAccount class extends BankAccount and adds the following attributes and
//behavior:
//interestRate (double) - represents the annual interest rate for the account
//calculateInterest() - a method that calculates and adds interest to the account balance
//The CheckingAccount class extends BankAccount and adds the following attributes and
//behavior:
//
//transactionFee (double) - represents the fee charged for each transaction (withdrawal
//or deposit)
//withdraw() - a method that allows the user to withdraw money from the account,
//deducting the transaction fee
//However, there is a requirement that the accountNumber attribute in the BankAccount
//class should be immutable, meaning it should not be modifiable once it is set.
//Implement the class hierarchy using the final keyword appropriately to enforce
//immutability for the accountNumber attribute.
class BankAccount {
    final int accountNumber = 123465;
    double balance;


}

class SavingsAccount extends BankAccount {
    double interestRate;

    void calculateInterest() {
        balance += (balance * interestRate) / 100.00;
    }
}

class CheckingAccount extends BankAccount {
    static Scanner io = new Scanner(System.in);
    final double transactionFee = 10;

    void withdraw() {
        double withdrawAmount;
        System.out.println("Enter the amount that you want to withdraw -->");
        withdrawAmount = io.nextDouble();
        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= withdrawAmount;
            balance -= transactionFee;
        }
    }

    void deposit() {
        System.out.println("Enter the amount that you want to deposit -->");
        balance += io.nextDouble();
    }
}

public class _question6 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();


        savingsAccount.balance = 1000.0;
        savingsAccount.interestRate = 2.5;

        checkingAccount.balance = 2000.0;


        savingsAccount.calculateInterest();

        checkingAccount.withdraw();
        checkingAccount.deposit();


        System.out.println("Savings Account Balance: " + savingsAccount.balance);
        System.out.println("Checking Account Balance: " + checkingAccount.balance);
    }
}

