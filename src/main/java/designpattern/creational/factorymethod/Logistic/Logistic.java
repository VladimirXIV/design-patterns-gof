package designpattern.creational.factorymethod.Logistic;

import designpattern.creational.factorymethod.Transport.Transport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;


public abstract class Logistic {

    private Collection<String> orders = new ArrayList<>();
    private LocalDate shipmentDate;

    /* factory method */
    protected abstract Transport createTransport();

    /**
     * Send orders with
     * @return Estimated delivery
     */
    public LocalDate send() {

        Transport transport = createTransport();
        Integer days = transport.deliver();

        shipmentDate = LocalDate.now();
        return shipmentDate.plusDays(days);
    }

    public void addOrder(String order) {
        this.orders.add(order);
    }

    public Collection<String> getOrders() {
        return this.getOrders();
    }

    /**
     *
     * @return date of shipment or null if orders was not shipped
     */
    public LocalDate getShipmentDate() {
        return shipmentDate;
    }
}
