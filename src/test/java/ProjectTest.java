package src.test.java;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import src.main.java.banking_system.BankAccount;
import src.main.java.banking_system.BankingSystem;
import src.main.java.banking_system.Transaction;

public class ProjectTest {
    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        BankAccount account1 = new BankAccount("12345", 1000.0, "Checking");
        system.addAccount(account1);

        // Testing deposit
        try {
            account1.deposit(500);
            checkCondition(account1.getBalance() == 1500, "Deposit Test", "Balance should be 1500 after deposit.");
        } 
        // In case of an error, print the following message
        catch (Exception e) {
            System.out.println("Deposit Test failed: " + e.getMessage());
        }

        // Testing withdrawal
        try {
            account1.withdraw(300);
            checkCondition(account1.getBalance() == 1200, "Withdrawal Test",
                    "Balance should be 1200 after withdrawal.");
        // In case of an error, print the following message
        } catch (Exception e) {
            System.out.println("Withdrawal Test failed: " + e.getMessage());
        }

        // Testing transactions
        BankAccount account2 = new BankAccount("67890", 2000.0, "Savings");
        system.addAccount(account2);
        try {
            Transaction transaction = new Transaction("12345", "67890", 200);
            system.recordTransaction(transaction);
            checkCondition(account1.getBalance() == 1000, "Transaction Test for account 1",
                    "Balance should be 1000 after transaction.");
            checkCondition(account2.getBalance() == 2200, "Transaction Test for account 2",
                    "Balance should be 2200 after transaction.");
        // In case of an error, print the following message
        } catch (Exception e) {
            System.out.println("Transaction Test failed: " + e.getMessage());
        }
    }
        // Method to check if the test passes or fails
    private static void checkCondition(boolean condition, String testName, String successMessage) {
        if (condition) {
            System.out.println(testName + " passed: " + successMessage);
        } else {
            System.out.println(testName + " failed.");
        }

    }
}
