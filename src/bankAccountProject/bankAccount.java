package bankAccountProject;

public class bankAccount {
    private double balance;
    private String accountHolder;

    public bankAccount(String accountHolder, double balance) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdrawal(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account Holder: " + accountHolder + "\nBalance: $" + balance;
    }
}
