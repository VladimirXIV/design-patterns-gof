package designpattern.creational.factorymethod.Logistic;

import designpattern.creational.factorymethod.Transport.Ship;
import designpattern.creational.factorymethod.Transport.Transport;

public class SeaLogistic extends Logistic {

    protected Transport createTransport() {
        return new Ship();
    }
}
