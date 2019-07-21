package designpattern.structural.composite;

public abstract class File {

    protected String name;

    protected File(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double getSize();
    public abstract String getInfo();
    public abstract void   showInfo();
}
