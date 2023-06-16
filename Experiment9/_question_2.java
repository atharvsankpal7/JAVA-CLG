package Experiment9;

abstract class BankAccount {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    int getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    final double interestRate = .025;

    SavingsAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    void deposit(double amount) {
        balance += (amount * interestRate) + amount;
        System.out.println("Balance Updated");
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Balance Updated");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance Updated");
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount > 10000) {
            System.out.println("Overdraft limit reached");
        } else {
            balance -= amount;
            System.out.println("Balance Updated");
        }
    }
}

public class _question_2 {
    public static void main(String[] args) {
        BankAccount sa1 = new SavingsAccount(122010, "Hemant Yadav");
        BankAccount sa2 = new CurrentAccount(215466, "Kiran Dombale");
        sa1.deposit(10000);
        sa2.deposit(10000);
        sa1.withdraw(1200);
        sa2.withdraw(1200);
        sa1.withdraw(12000);
        sa1.deposit(12000);

        sa1.display();
        sa2.display();
    }
}
