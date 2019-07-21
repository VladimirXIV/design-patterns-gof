package designpattern.structural.facade;

import java.math.BigDecimal;

public class ClientData {

    private String accountNumber;
    private BigDecimal sum;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}
