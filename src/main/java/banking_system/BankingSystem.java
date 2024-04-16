package src.main.java.banking_system;

import java.util.HashMap;
import java.util.TreeSet;

public class BankingSystem {
    // HashMap, we are going to store account infomation (aacountNumber ->
    // BankAccount)
    private HashMap<Integer, BankAccount> accounts;
    // TreeSet, we are going to store transaction logs sorted by timestamp
    private TreeSet<Transaction> transactionLogs;

    // Constructor to initialize data strucutres
    public BankingSystem() {
        accounts = new HashMap<>();
        transactionLogs = new TreeSet<>();
        // If we need additional initialization it can go here
    }

    // Method to run the banking system
    public void run() {
        // Here we want to Implement system funcionalites, user interface, etc.
    }

    // Implement other methods for user authentication, account management,
    // transaction handling, etc. as we need them.
}
