package designpattern.creational.prototype;

public class BankAccount extends BillingDetail {

    String bankName;
    String swiftCode;
    String bic;


    public BankAccount() {

    }

    public BankAccount(BankAccount bankAccount) {
        if (bankAccount != null) {
            this.bankName = bankAccount.getBankName();
            this.swiftCode = bankAccount.getSwiftCode();
            this.bic = bankAccount.getBic();
        }
    }


    @Override
    public BillingDetail clone() {
        return new BankAccount(this);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", swiftCode='" + swiftCode + '\'' +
                ", bic='" + bic + '\'' +
                '}';
    }
}
