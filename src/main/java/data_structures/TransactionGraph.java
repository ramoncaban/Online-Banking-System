package src.main.java.data_structures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import src.main.java.banking_system.Transaction;

public class TransactionGraph {
    // HashMap linking account numbers to their transaction.
    private HashMap<String, Set<Transaction>> graph = new HashMap<>();
    // Adds a transaction to the graph for both the source and destination accounts.
    public void addTransaction(Transaction transaction) {
        // Add source account if not present and then add the transaction.
        graph.putIfAbsent(transaction.getSourceAccount(), new HashSet<>());
        graph.get(transaction.getSourceAccount()).add(transaction);
        // Add destination account if not present and then add the transaction.
        graph.putIfAbsent(transaction.getDestinationAccount(), new HashSet<>());
        graph.get(transaction.getDestinationAccount()).add(transaction);
    }
    // Returns all transactions associated with a given account number.
    public Set<Transaction> getTransactions(String accountNumber) {
        return graph.getOrDefault(accountNumber, new HashSet<>());
    }
}
