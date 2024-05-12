package src.main.java.banking_system;

public class BankAccount {
    //Set of private variables
    private String accountNumber;
    private double balance;
    private String accountType;

    // Constructor to initialize a new BankAccount with an account number.
    public BankAccount(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }
    // Returns the account numbers.
    public String getAccountNumber() {
        return accountNumber;
    }
    // Returns the current balance of the account.
    public double getBalance() {
        return balance;
    }

    // Added accountType
    public String getAccountType() {
        return accountType;
    }

    // Added boolean isChecking
    public boolean isChecking() {
        return "checking".equalsIgnoreCase(accountType);
    }

    // Added canTransfer
    public boolean canTransfer() {
        return isChecking();
    }
    // Method to deposit a specified amount into the account.
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }
    // Method to withdraw a specified amount from the account.
    public void withdraw(double amount) {
        if ("savings".equalsIgnoreCase(accountType) && amount > 1000) {
            throw new IllegalArgumentException("Withdrawl limit for savings accounts exceeded");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawl amount must be positive");
        } else {
            this.balance -= amount;
        }
    }

    // Added Override
    @Override
    public String toString() {
        return String.format("Account Number: %s, Balance: %.2f, Type: %s", accountNumber, balance, accountType);
    }
}
