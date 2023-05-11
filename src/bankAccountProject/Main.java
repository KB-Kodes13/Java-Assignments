package bankAccountProject;

public class Main {
    public static void main(String[] args) {
        bankAccount account = new bankAccount("Kelan", 500);
        bankAccount account1 = new bankAccount("John", 5000);
        bankAccount account2 = new bankAccount("Javier", 300);

        account.deposit(100);
        System.out.println(account);

        account1.withdrawal(100);
        account2.deposit(100);

        System.out.println(account1);
        System.out.println(account2);
    }
}
