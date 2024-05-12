package src.main.java.banking_system;

public class Transaction {
    // Private variable to hold the source account number.
    private String sourceAccount;
    // Private variable to hold the destination account number.
    private String destinationAccount;
    // Private variable to hold the transaction amount.
    private double amount;
    // Private variable to store the timestamp when the transaction was created.
    private long timestamp;

    // Constructor for the transaction class.
    // It also sets the timestamp to the current system time.
    public Transaction(String sourceAccount, String destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = System.currentTimeMillis(); // Sets the timestamp using the current system time.
    }
    // method for the source account number.
    public String getSourceAccount() {
        return sourceAccount;
    }
    // method for the destination account number.
    public String getDestinationAccount() {
        return destinationAccount;
    }
    // method for the transaction amount.
    public double getAmount() {
        return amount;
    }
    // method for the timestamp of the transaction.
    public long getTimestamp() {
        return timestamp;
    }
}
