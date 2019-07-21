package designpattern.structural.composite;

public class JpegFile extends File {

    private String type = "jpeg";
    private Double size;

    public JpegFile(String name, Double size) {
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
