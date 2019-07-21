package designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionManager {

    private List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public boolean hasPendingTransactions() {
        return transactions.stream()
                .filter(transaction -> transaction.getStatus().equals(CommandState.ExecuteFailed)
                                                           || transaction.getStatus().equals(CommandState.Unprocessed)
                                                           || transaction.getStatus().equals(CommandState.UndoFailed))
                .collect(Collectors.toList())
                .isEmpty();
    }

    public void processPendingTransactions() {

        transactions.forEach(transaction -> {

            if (transaction.getStatus().equals(CommandState.ExecuteFailed) || transaction.getStatus().equals(CommandState.Unprocessed)) {
                transaction.execute();
            }

        });

        transactions.forEach(transaction -> {
            if (transaction.getStatus().equals(CommandState.ExecuteFailed)) {
                transaction.undo();
            }
        });
    }

    public void UndoTransactionNumber(String id) {
        Optional<Transaction> transaction = this.transactions.stream().filter(transaction1 -> transaction1.getId().equals(id)).findFirst();
        if (!transaction.isPresent()) {

        }

        if (transaction.get().getStatus().equals(CommandState.ExecuteSucceeded)) {

        }

        transaction.get().undo();

        if (transaction.get().getStatus().equals(CommandState.UndoSucceeded)) {
            transactions.remove(transaction.get());
        }
    }

    public void removeOldTransactions() {
        //this.transactions.stream().filter(transaction -> transaction.getDate().after(new Date()))
    }

}
