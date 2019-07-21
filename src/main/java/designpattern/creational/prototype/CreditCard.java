package designpattern.creational.prototype;

import java.time.Month;
import java.time.Year;

public class CreditCard extends BillingDetail {

    CreditCardType creditCardType;
    Address billingAddress;
    Month expireMonth;
    Year  expireYear;


    public CreditCard() {

    }

    public CreditCard(CreditCard creditCard) {
        super(creditCard);
        if (creditCard != null) {
            this.creditCardType = creditCard.getCreditCardType();
            this.expireMonth = creditCard.getExpireMonth();
            this.expireYear = creditCard.getExpireYear();
            this.billingAddress = creditCard.getBillingAddress();
        }
    }


    @Override
    public BillingDetail clone() {
        return new CreditCard(this);
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public Month getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(Month expireMonth) {
        this.expireMonth = expireMonth;
    }

    public Year getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(Year expireYear) {
        this.expireYear = expireYear;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCardType=" + creditCardType +
                ", billingAddress=" + billingAddress +
                ", expireMonth=" + expireMonth +
                ", expireYear=" + expireYear +
                '}';
    }
}
