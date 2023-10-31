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
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn PHP " + amount);
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
      BankAccount in = new BankAccount();
      in.deposit(50000);
      in.withdraw(10000);
      in.displayAccountInfo();

    }
}
