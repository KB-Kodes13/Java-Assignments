package bankAccountProject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankAccount2Main {
    public static void main(String[] args) {

        ArrayList<BankAccount2> accountList = new ArrayList<>();
       BankAccount2 account0 = new BankAccount2("Kelan", 15000,13000);
       BankAccount2 account1 = new BankAccount2("Taty", 20000,14000);
       BankAccount2 account2 = new BankAccount2("Mary", 25000, 15000);
       accountList.add(account0);
       accountList.add(account1);
       accountList.add(account2);

        Scanner userInput        =       new Scanner(System.in);
        System.out.println("Are you an existing customer? (-1 to exit) ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int userChoice = userInput.nextInt();

        while(true){
            if (userChoice == 1) {
                userInput = new Scanner(System.in);
                System.out.println("Enter the account number: [13000,14000, or 15000]");
                int accountNumber = userInput.nextInt();

                for (int i = 0; i < accountList.size(); i++) {
                    BankAccount2 account = accountList.get(i);
                    int num = account.accountNumber;
                    if (num == accountNumber) {
                        mainMenu(account,account.accountNumber,accountList);
                        break;
                    }
                }
                break;

            } else if (userChoice == 2) {
                BankAccount2 newAccount = new BankAccount2();
                accountList.add(newAccount);
                System.out.println("");
                mainMenu(newAccount, newAccount.accountNumber, accountList);
                break;
            } else if (userChoice == -1) {
                System.out.print("Have a nice day!! Goodbye!");
                break;
            } else {
                System.out.print("Invalid choice");
                userChoice = userInput.nextInt();
            }
          }
      }

    public static void mainMenu(BankAccount2 account, int newAccountNum, List<BankAccount2> accountList){
        System.out.println("Welcome " + account.accountHolder + "!");
        while (true){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Welcome to the Main Menu, what would you like to do today?");
            System.out.println("1. Account Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Make a Transfer to an another account");
            System.out.println("0. Exit");
            int userChoice = userInput.nextInt();
            if (userChoice == 1) {
                account.bankStatement();

            } else if (userChoice == 2) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("How much would you like to withdraw?");
                double amount = prompt.nextDouble();
                account.withdrawal(amount);

            } else if (userChoice == 3) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("How much would you like to deposit?");
                double amount = prompt.nextDouble();
                account.deposit(amount);

            } else if (userChoice == 4) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("Please enter the account number you would like to transfer to? [Please choose between 13000,14000,or 15000]");
                int accountNumber   = prompt.nextInt();

                System.out.println("How much would you like to transfer?");
                double amount = prompt.nextDouble();

                for (int i = 0; i < accountList.size(); i++) {
                    BankAccount2 accountTo = accountList.get(i);
                    int num = accountTo.accountNumber;
                    if (num == accountNumber) {
                        account.bankTransfer(account, accountTo, amount);
                        break;
                    }
                }
            } else if (userChoice == 0) {
                System.out.print("Have a DEVlightful day!! Goodbye!");
                break;
            }else {
                System.out.print("Error, not a valid choice");
                userChoice = userInput.nextInt();
            }
        }


    }


}
