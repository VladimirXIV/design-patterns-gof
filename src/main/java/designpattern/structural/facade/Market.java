package designpattern.structural.facade;

public class Market {

    ProductStore productStore;
    PaymentService paymentService;
    ShippingService shippingService;



    public Market() {

        this.productStore = new ProductStorImpl();
        this.paymentService = new PaymentServiceImpl();
        this.shippingService = new ShippingServiceImpl();

    }

    public void placeOrder(String itemId) throws Exception {

        Item item = productStore.getProduct(itemId);

        /*   */
        if (item == null) {
            throw new Exception("Sorry, this item is out of stock");
        }


        paymentService.doPaiment(item.getPrice());

        shippingService.deliver();

    }
}
