package designpattern.creational.prototype;

import java.time.Month;
import java.time.Year;

public class Application {

    public static void main(String[] args) {

        BillingDetail billingDetail;
        BillingDetail clonedBillingDetail;

        CreditCard creditCard = new CreditCard();
        creditCard.setCreditCardType(CreditCardType.CAPITALONE);
        creditCard.setExpireMonth(Month.APRIL);
        creditCard.setExpireYear(Year.of(2020));
        creditCard.setBillingAddress(new Address("1967 Gernsback Way", "Green Town", "WI", "54459", "United States"));

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankName("Transatlantic Bank");
        bankAccount.setBic("BH58");
        bankAccount.setSwiftCode("CITITHBX");


        clonedBillingDetail = creditCard;
        System.out.println(clonedBillingDetail);

        clonedBillingDetail = bankAccount;
        System.out.println(clonedBillingDetail);
    }

}