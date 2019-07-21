package designpattern.creational.prototype;

public abstract class BillingDetail {

    private Integer number;
    private String owner;


    public BillingDetail() {

    }

    public BillingDetail(BillingDetail billingDetail) {
        if (billingDetail != null) {
            this.number = billingDetail.getNumber();
            this.owner = billingDetail.getOwner();
        }
    }


    public abstract BillingDetail clone();

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "BillingDetail{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                '}';
    }
}
