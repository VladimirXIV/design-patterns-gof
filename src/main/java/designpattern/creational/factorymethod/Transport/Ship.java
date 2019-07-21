package designpattern.creational.factorymethod.Transport;

public class Ship extends Transport {

    public Integer deliver() {
        System.out.println("Ship delivery!");
        return 9;
    }

}
