package designpattern.creational.factorymethod;

import designpattern.creational.factorymethod.Logistic.AirLogistic;
import designpattern.creational.factorymethod.Logistic.Logistic;
import designpattern.creational.factorymethod.Logistic.SeaLogistic;

import java.time.LocalDate;

public class Application  {

    private static Logistic initialize(DeliveryType deliveryType) {

        Logistic logistic = null;

        switch (deliveryType) {

            case Air:
                logistic = new AirLogistic();
                break;

            case Sea:
                logistic = new SeaLogistic();
                break;

        }

        return logistic;
    }

    public static void main(String[] args) {

        Logistic logistic = initialize(DeliveryType.Air);
        LocalDate estimateDate = logistic.send();
        System.out.println(String.format("Shipment date: %s, estimate date: %s", logistic.getShipmentDate(), estimateDate));

        logistic = initialize(DeliveryType.Sea);
        estimateDate = logistic.send();
        System.out.println(String.format("Shipment date: %s, estimate date: %s", logistic.getShipmentDate(), estimateDate));
    }

}