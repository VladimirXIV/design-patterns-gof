package designpattern.behavioral.command;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        TransactionManager transactionManager = new TransactionManager();

        Account accountOne = new Account("Waldemar", BigDecimal.valueOf(14880));
        Deposit depositOne = new Deposit("#ID1488", accountOne, BigDecimal.valueOf(120));
        transactionManager.addTransaction(depositOne);

        // Command has been added to the queue, but not executed.
        System.out.println(String.format("accountOne, balance = {}", accountOne.getBalance()));
        System.out.println(String.format("transactionManager, pending transactions = {}", transactionManager.hasPendingTransactions()));

        // Execute the command
        transactionManager.processPendingTransactions();

        // Must be 15 000
        System.out.println(String.format("accountOne, balance = {}", accountOne.getBalance()));
        System.out.println(String.format("transactionManager, pending transactions = {}", transactionManager.hasPendingTransactions()));

        Withdraw withdrawOne = new Withdraw("#ID1404",accountOne, BigDecimal.valueOf(10000));

        // Execute the command
        transactionManager.processPendingTransactions();

        // Must be 5 000
        System.out.println(String.format("accountOne, balance = {}", accountOne.getBalance()));
        System.out.println(String.format("transactionManager, pending transactions = {}", transactionManager.hasPendingTransactions()));

    }

}
