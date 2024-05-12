package src.main.java.banking_system;

public class Main {
    public static void main(String[] args) {
        // Initialize the BankSystem instance.
        BankingSystem system = new BankingSystem();
        // Create two bank accounts with initial details.
        BankAccount account1 = new BankAccount("12345", 5000.0, "Checking");
        BankAccount account2 = new BankAccount("67890", 3000.0, "Savings");
        // Add both accounts to the banking system.
        system.addAccount(account1);
        system.addAccount(account2);

        // Create a transaction and record it in the system.
        Transaction transaction1 = new Transaction("12345", "67890", 1500.0);
        system.recordTransaction(transaction1);

        // Print the balance of both accounts after the transaction.
        System.out.println("Balance of Account 12345: " + system.getAccount("12345").getBalance());
        System.out.println("Balance of Account 67890: " + system.getAccount("67890").getBalance());

    }
}
