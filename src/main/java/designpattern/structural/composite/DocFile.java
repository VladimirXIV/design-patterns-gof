package designpattern.structural.composite;

public class DocFile extends File {

    private String type = "doc";
    private Double size;

    public DocFile(String name, Double size) {
        super(name);
        this.size = size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public Double getSize() {
        return size;
    }

    @Override
    public String getInfo() {
        return String.format("%s  %s  %s", this.type, this.name, this.size);
    }

    @Override
    public void showInfo() {
        System.out.print("\t");
        System.out.println(getInfo());
    }
}
