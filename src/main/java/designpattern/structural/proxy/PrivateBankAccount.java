package designpattern.structural.proxy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* Proxy */
public class PrivateBankAccount implements Account {

    private String number;
    private Person person;

    private Account account;


    public PrivateBankAccount(Person person, String accountNumber) {
        this.account = new BankAccount();
        this.number = accountNumber;
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public BigDecimal getBalance() {
        return this.account.getBalance();
    }

    @Override
    public BigDecimal deposit(BigDecimal sum) throws NoPrivilegesException {
        if (checkPrivileges(Operation.DEPOSIT)) {
            return this.account.deposit(sum.abs());
        } else {
            throw new NoPrivilegesException(String.format("No privileges to this operation(%s)", Operation.DEPOSIT.toString()));
        }
    }

    @Override
    public BigDecimal withdraw(BigDecimal sum) throws NoPrivilegesException {
        if (checkPrivileges(Operation.WITHDRAW)) {
            return this.account.withdraw(sum.abs());
        } else {
            throw new NoPrivilegesException(String.format("No privileges to this operation(%s)", Operation.WITHDRAW.toString()));
        }
    }

    /* Check privileges to do operation */
    private boolean checkPrivileges(Operation operation) {
        Collection<Person> persons = getPersons(this.person, this.number, operation);
        return persons.contains(this.person);
    }

    /* fake-method, simulating database request. Get all persons, those can do operation with account number */
    private Collection<Person> getPersons(Person person, String accountNumber, Operation operation) {

        Collection<Person> persons = null;

        switch (operation) {

            case DEPOSIT:
                persons = new ArrayList<>(
                        Arrays.asList(new Person("Киркорова", "Анна", "9089668907"),
                                new Person("Шулежко", "Степан", "9012668907"),
                                new Person("Макарова", "Анна", "4567668907"),
                                new Person("Вилкина", "Жанна", "9089668001"),
                                new Person("Скрепкин", "Анатолий", "3000662407"))
                );
                break;

            case WITHDRAW:
                persons = new ArrayList<>(
                        Arrays.asList(new Person("Муркина", "Анна", "9089668907"),
                                new Person("Вилкова", "Елена", "9000668917"),
                                new Person("Макарова", "Анна", "4567668907"),
                                new Person("Вилкина", "Жанна", "9089668001"))
                );
                break;

        }

        return persons;
    }
}
