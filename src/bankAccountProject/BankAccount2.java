package bankAccountProject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class BankAccount2 {
    public double balance;
    public String accountHolder;
    public int accountNumber;

    public BankAccount2(String accountHolder, double balance, int accountNumber) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    public BankAccount2() {
        ArrayList<BankAccount2> accountList = new ArrayList<>();



        System.out.print("Welcome to the Bank of Devs. Let's make a new account! ");
        Scanner accountName = new Scanner(System.in);
        System.out.println("Please enter a name for the Account: ");
        this.accountHolder = accountName.nextLine();

        Scanner newBalance = new Scanner(System.in);
        System.out.println("What is the beginning balance for the account?");
        this.balance = newBalance.nextDouble();

        int minAccountNum = 10000;
        int maxAccountNum = 99999;

        Random random = new Random();
        this.accountNumber = random.nextInt(maxAccountNum - minAccountNum + 1) + minAccountNum;

    }
    public double deposit(double bringIn) {
        this.balance = this.balance + bringIn;
        System.out.println(this.accountHolder + "'s account balance: " + this.balance);
        System.out.println("");

        return this.balance;
    }
    public double withdrawal(double takeOut) {
        this.balance = this.balance - takeOut;
        System.out.println(this.accountHolder + "'s account balance: " + this.balance);
        System.out.println("");

        return this.balance;
    }
    public void bankStatement() {
        System.out.println(this.accountHolder + "'s account balance: " + this.balance);
        System.out.println("");

    }
    public double bankTransfer(BankAccount2 acc1, BankAccount2 acc2, double transferAmount) {
        acc1.balance -= transferAmount;
        acc2.balance += transferAmount;
        System.out.println( acc1.accountHolder + "'s account balance: " + acc1.balance);
        System.out.println( acc2.accountHolder + "'s account balance: " + acc2.balance);
        System.out.println("");

        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Bank Account: " + accountHolder + ", Balance: " + balance + ", Account Number: " + accountNumber;
    }
}
