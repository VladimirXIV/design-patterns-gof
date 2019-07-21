package designpattern.behavioral.command;

import java.math.BigDecimal;
import java.util.Date;

public class Transfer implements Transaction {

    private String id;
    private Date   date;

    private Account fromAccount;
    private Account toAccount;
    private BigDecimal amount;

    private CommandState status;


    public Transfer(String id, Account fromAccount, Account toAccount, BigDecimal amount) {

        this.id = id;
        this.date = new Date();

        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;

        this.status =CommandState.Unprocessed;
    }


    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    @Override
    public void setStatus(CommandState commandState) {
        this.status = commandState;
    }

    @Override
    public CommandState getStatus() {
        return this.status;
    }

    @Override
    public void execute() {
        if (fromAccount.getBalance().compareTo(amount) != -1) {
            fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
            toAccount.setBalance(toAccount.getBalance().add(amount));
            this.status = CommandState.ExecuteSucceeded;
        } else {
            this.status = CommandState.ExecuteFailed;
        }
    }

    @Override
    public void undo() {
        if (toAccount.getBalance().compareTo(amount) != -1) {
            toAccount.setBalance(toAccount.getBalance().subtract(amount));
            fromAccount.setBalance(fromAccount.getBalance().add(amount));
            this.status = CommandState.ExecuteSucceeded;
        } else {
            this.status = CommandState.ExecuteFailed;
        }
    }
}
