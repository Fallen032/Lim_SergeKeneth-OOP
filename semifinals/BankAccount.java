import java.util.Scanner;
public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    // Default constructor
    public BankAccount() {
        accountNumber = 232434;
        accountName = "Jonathan";
         balance = 0;
    }

    // Parameterized constructor for customization
    public BankAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Getters and setters for encapsulation
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited PHP " + amount);
            System.out.print("\n");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn PHP " + amount);
            System.out.print("\n");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: PHP " + balance);
        

        
    }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      BankAccount account = new BankAccount();
      
    while (true) {
            System.out.print("[1] to deposit\n[2] to withdraw\n[3] to check balance\n[4] to exit\nChoice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit PHP: ");
                    double deposit = input.nextDouble();
                    account.deposit(deposit);
                    account.displayAccountInfo();
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw PHP: ");
                    double withdraw = input.nextDouble();
                    account.displayAccountInfo();
                    if (withdraw <= account.getBalance()) {
                        account.withdraw(withdraw);
                    } else {
                        System.out.println("You don't have that amount in your bank account!");
                    }
                    break;

                case 3:
                    account.displayAccountInfo();
                    break;

                case 4:
                    System.out.println("EXITING ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            // Ask the user if they want to perform another transaction
            System.out.print("Do you want to perform another transaction? (yes/no): ");
            String continueChoice = input.next().toLowerCase();
            if (!continueChoice.equals("yes")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }
}
