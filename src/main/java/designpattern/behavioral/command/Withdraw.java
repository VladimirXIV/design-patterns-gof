package designpattern.behavioral.command;

import java.math.BigDecimal;
import java.util.Date;

public class Withdraw implements Transaction {

    private String id;
    private Date   date;

    private Account account;
    private BigDecimal amount;

    private CommandState status;


    public Withdraw(String id, Account account, BigDecimal amount) {

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

        if (account.getBalance().compareTo(amount) != -1) {
            account.setBalance(account.getBalance().subtract(amount));
            this.status = CommandState.ExecuteSucceeded;
        } else {
            this.status = CommandState.ExecuteFailed;
        }

    }

    @Override
    public void undo() {
        account.setBalance(account.getBalance().subtract(amount));
        this.status = CommandState.UndoSucceeded;
    }
}
