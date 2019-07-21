package designpattern.creational.factorymethod.Transport;

public class Dirigible extends Transport {

    public Integer deliver() {
        System.out.println("Dirigible delivery!");
        return 5;
    }
}
