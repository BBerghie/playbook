package es.poc.factory.entity.payment.pojo.concrete;

import es.poc.factory.entity.payment.enums.PaymentType;
import es.poc.factory.entity.payment.pojo.BasePaymentPOJO;

/**
 *
 * @author dbgd
 */
public class ApplePayPOJO extends BasePaymentPOJO{
    String specificVariable;
    
    public ApplePayPOJO(long paymnetId, PaymentType paymentType, String specificVariable) {
        super(paymnetId, paymentType);
        this.specificVariable = specificVariable;
    }

    public String getSpecificVariable() {
        return specificVariable;
    }

    public void setSpecificVariable(String specificVariable) {
        this.specificVariable = specificVariable;
    }
}
