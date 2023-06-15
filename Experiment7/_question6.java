package Experiment7;

import java.util.Scanner;

//Problem Statement: Implement a simple banking system using object-oriented programming principles,
//specifically focusing on the concept of polymorphism.
//Requirements:
//1. The banking system should support three types of accounts: savings, checking, and investment.
//2. Each account should have the following common functionalities: deposit, withdraw, and check
//balance.
//3. The specific implementation of these functionalities should vary based on the type of account.
//4. The system should be able to handle multiple accounts of different types.
//5. The user should be able to perform operations on any type of account without knowing the
//specific account type.
abstract class Account {
    static Scanner io = new Scanner(System.in);
    int accountNumber;
    double balance;

    Account(int acn, double b) {
        accountNumber = acn;
        balance = b;
    }

    void deposit() {
        System.out.println("Enter the amount to withdraw -->");
        balance += io.nextDouble();
        System.out.println("Balance deposited!");
    }

    void withdraw() {
        System.out.println("Enter the amount to withdraw -->");
        double withdrawAmount = io.nextDouble();
        if (balance < withdrawAmount)
            System.out.println("Insufficient balance!!!\nCurrent balance is " + balance + "\nPlease re-enter the amount!!!");
        else {
            balance -= withdrawAmount;
            System.out.println("Amount withdraw");
        }
    }

    void checkBalance() {
        System.out.printf("The balance in the account %d is %f", accountNumber, balance);
    }

}

class SavingsAccount extends Account {


    SavingsAccount(int acn, double b) {
        super(acn, b);
    }

    void withdraw() {
        System.out.println("Enter the amount that you want to withdraw -->");
        double withdrawAmount = io.nextDouble();
        if (withdrawAmount > 15000) {
            System.out.println("You can only withdraw 15000 max per day!!!");
            withdraw();//recursive call
        } else balance -= withdrawAmount;
    }

}

class CheckingsAccount extends Account {


    CheckingsAccount(int acn, double b) {
        super(acn, b);
    }

    void deposit() {
        System.out.println("Enter the amount to withdraw -->");
        double depositAmount = (io.nextDouble() * 1.05);

        balance += depositAmount;
        System.out.println("Amount deposited");

    }

}

class InvestmentAccount extends Account {
    InvestmentAccount(int acn, double b) {
        super(acn, b);
    }

    @Override
    void deposit() {
        System.out.println("Enter the amount that you want to deposit");
        double depositAmount = io.nextDouble();
        if (depositAmount > balance) {
            System.out.println("Insufficient balance");
            deposit();//recursive call
        } else if (depositAmount < 10000) {
            System.out.println("Please insert more amount than 10000!!!!");
            deposit();//recursive call
        } else {
            balance += depositAmount;
            System.out.println("Amount deposited");
        }
    }


}

public class _question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account[] accounts = new Account[3];
        accounts[0] = new SavingsAccount(1, 10000);
        accounts[1] = new CheckingsAccount(2, 20000);
        accounts[2] = new InvestmentAccount(3, 30000);

        System.out.println("Banking System");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            if (option == 4) {
                System.out.println("Exiting the program...");
                scanner.close();
                System.exit(0);
            }

            System.out.println("Select an account type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Checking Account");
            System.out.println("3. Investment Account");

            int accountType = scanner.nextInt();

            if (accountType < 1 || accountType > 3) {
                System.out.println("Invalid account type!");
                continue;
            }

            Account selectedAccount = accounts[accountType - 1];

            switch (option) {
                case 1:
                    selectedAccount.deposit();
                    break;
                case 2:
                    selectedAccount.withdraw();
                    break;
                case 3:
                    selectedAccount.checkBalance();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
