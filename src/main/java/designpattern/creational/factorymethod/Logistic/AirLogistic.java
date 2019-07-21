package designpattern.creational.factorymethod.Logistic;

import designpattern.creational.factorymethod.Transport.Dirigible;
import designpattern.creational.factorymethod.Transport.Transport;

public class AirLogistic extends Logistic {

    protected Transport createTransport() {
        return new Dirigible();
    }
}
