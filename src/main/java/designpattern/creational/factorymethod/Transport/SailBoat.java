package designpattern.creational.factorymethod.Transport;

public class SailBoat extends Transport {

    public Integer deliver() {
        System.out.println("SailBoat delivery!");
        return 15;
    }
}
