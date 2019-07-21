package designpattern.structural.facade;

import java.math.BigDecimal;

public class PaymentServiceImpl implements PaymentService {

    private BigDecimal paymentReceiver;

    @Override
    public void doPaiment(BigDecimal sum) {
        this.paymentReceiver.add(sum);
    }
}
