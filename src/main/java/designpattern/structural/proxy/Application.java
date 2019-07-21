package designpattern.structural.proxy;

import designpattern.structural.composite.DocFile;
import designpattern.structural.composite.File;
import designpattern.structural.composite.Folder;
import designpattern.structural.composite.JpegFile;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        Person person = new Person("Макарова","Анна",  "4567668907");

        Account account = new PrivateBankAccount(person, "0000 9876 1221 7860");
        try {
            account.deposit(BigDecimal.valueOf(57.50));
        } catch (NoPrivilegesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Account balance: " + account.getBalance());

        try {
            account.withdraw(BigDecimal.valueOf(37.50));
        } catch (NoPrivilegesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Account balance: " + account.getBalance());

    }

}