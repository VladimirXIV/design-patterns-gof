package designpattern.structural.proxy;

import java.math.BigDecimal;

public interface Account {

    public BigDecimal getBalance();
    public BigDecimal withdraw(BigDecimal sum) throws NoPrivilegesException;
    public BigDecimal deposit(BigDecimal sum) throws NoPrivilegesException;

}
