/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.poc.factory.entity.payment;

import es.poc.factory.entity.payment.enums.PaymentType;
import es.poc.factory.entity.payment.impl.ApplePayment;
import es.poc.factory.entity.payment.impl.GooglePayment;
import es.poc.factory.entity.payment.impl.PayPalPayment;
import es.poc.factory.entity.payment.impl.VisaPayment;
import java.util.HashMap;

/**
 *
 * @author bgd
 */
public class PaymentFactory {
    
    private static final HashMap<PaymentType, Payment> paymentHM = new HashMap<>(){{
        put(PaymentType.APPLE_PAY, new ApplePayment());
        put(PaymentType.GOOGLE_PAY, new GooglePayment());
        put(PaymentType.PAYPAL, new PayPalPayment());
        put(PaymentType.VISA, new VisaPayment());
    }};
    
    public Payment getPayment(PaymentType pt){
        return paymentHM.get(pt);
    }
    
    @Deprecated
    public Payment oldGetPayment(PaymentType pt){
        return switch (pt) {
                case APPLE_PAY -> new ApplePayment();
                case GOOGLE_PAY -> new GooglePayment();
                case PAYPAL -> new PayPalPayment();
                case VISA -> new VisaPayment();
        };
    }
}
