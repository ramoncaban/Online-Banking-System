package src.main.java.banking_system;

import java.util.HashMap;
import java.util.TreeMap;

public class BankingSystem {
    // HashMap to store bank accounts with the account number as the key.
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    // TreeMap to store transactions, sorted by timestamp.
    private TreeMap<Long, Transaction> transactionLog = new TreeMap<>();

    // Method to add a new account to the accounts HashMap.
    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }
    // Method to retrieve an account by account number.
    public BankAccount getAccount(String accountNumber) {
        return accounts.getOrDefault(accountNumber, null);
    }
    // adds the transaction to the transaction log and processes it.
    public void recordTransaction(Transaction transaction) {
        transactionLog.put(transaction.getTimestamp(), transaction);
        processTransaction(transaction);
    }
    // Private method to process a transaction, transferring funds from the source account to the destination account.
    private void processTransaction(Transaction transaction) {
        BankAccount source = accounts.get(transaction.getSourceAccount());
        BankAccount destination = accounts.get(transaction.getDestinationAccount());

    // checks if both accounts exist and the source has enough balance before proceeding with the transaction.
        if (source != null && destination != null && source.getBalance() >= transaction.getAmount()) {
            source.withdraw(transaction.getAmount());
            destination.deposit(transaction.getAmount());
        } else {
            throw new IllegalStateException("Transaction failed");
        }
    }
    // Method to get the entire transaction log.
    public TreeMap<Long, Transaction> getTransactionLog() {
        return transactionLog;
    }
}
