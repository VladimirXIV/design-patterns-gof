package designpattern.behavioral.command;

import java.math.BigDecimal;
import java.util.Date;

public class Deposit implements Transaction {

    private String id;
    private Date   date;

    private Account account;
    private BigDecimal amount;

    private CommandState status;


    public Deposit(String id, Account account, BigDecimal amount) {

        this.id = id;
        this.date = new Date();

        this.account = account;
        this.amount = amount;

        this.status = CommandState.Unprocessed;
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
        account.setBalance(account.getBalance().add(amount));
        this.status = CommandState.ExecuteSucceeded;
    }

    @Override
    public void undo() {
        if (account.getBalance().compareTo(amount) != -1) {
            account.setBalance(account.getBalance().subtract(amount));
        } else {
            this.status = CommandState.UndoFailed;
        }
    }
}
