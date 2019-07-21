package designpattern.structural.proxy;

import java.util.Objects;

public class Person {

    private String passportNumber;
    private String name;
    private String surname;


    public Person(String name, String surname, String passportNumber) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.surname = surname;
    }


    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(passportNumber, person.passportNumber) &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, name, surname);
    }
}
