package designpattern.structural.proxy;

import java.math.BigDecimal;

public class BankAccount implements Account {

    private BigDecimal balance = new BigDecimal("0.0");

    @Override
    public BigDecimal getBalance() {
        return this.balance;
    }

    @Override
    public BigDecimal deposit(BigDecimal sum) {
        this.balance = this.balance.add(sum.abs());
        return this.balance;
    }

    @Override
    public BigDecimal withdraw(BigDecimal sum) {
        this.balance = this.balance.subtract(sum.abs());
        return this.balance;
    }
}
