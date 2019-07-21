package designpattern.behavioral.command;

import java.util.Date;

public interface Transaction {

    public void setId(String id);
    public String getId();

    public void setDate(Date date);
    public Date getDate();

    public void setStatus(CommandState commandState);
    public CommandState getStatus();

    public void execute();

    public void undo();   // undo ability
}
