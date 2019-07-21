package designpattern.creational.factorymethod.Transport;

public class Plane extends Transport {

    public Integer deliver() {
        System.out.println("Plane delivery!");
        return 2;
    }
}
