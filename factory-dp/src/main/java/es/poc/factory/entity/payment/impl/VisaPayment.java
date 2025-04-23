package es.poc.factory.entity.payment.impl;

import es.poc.factory.entity.payment.Payment;
import es.poc.factory.entity.payment.pojo.BasePaymentPOJO;
import java.util.HashSet;

/**
 *
 * @author bgd
 */
public class VisaPayment implements Payment {

    @Override
    public String howAmI() {
        return VisaPayment.class.getName();
    }

    @Override
    public boolean setPayment(BasePaymentPOJO paymentPOJO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HashSet<BasePaymentPOJO> getSetOfPayments(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
