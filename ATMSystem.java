import java.util.Scanner;
class BankAccount { // Class to represent the user's bank account
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Your new balance is: " + balance);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Your new balance is: " + balance);
            return true;
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
            return false;
        }
        else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }
}
class ATM { // Class to represent the ATM
    private BankAccount account;
    public ATM(BankAccount account) {
        this.account = account;
    }
    public void withdraw(double amount) {// Method to withdraw money
        account.withdraw(amount);
    }
    public void deposit(double amount) { // Method to deposit money
        account.deposit(amount);
    }
    public void checkBalance() { // Method to check balance
        System.out.println("Your current balance is: " + account.getBalance());
    }
    public void userInterface() { // User Interface for ATM
        Scanner scanner = new Scanner(System.in);
        int options;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            options = scanner.nextInt();
            switch (options) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
        while (options != 4);
    }
}
public class ATMSystem { // Main class to run the ATM system
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); // Create a bank account with an initial balance
        ATM atm = new ATM(account); // Create an ATM object
        atm.userInterface(); // Run the ATM user interface
    }
}
