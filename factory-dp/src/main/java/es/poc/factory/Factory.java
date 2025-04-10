/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.poc.factory;

import es.poc.factory.entity.payment.Payment;
import es.poc.factory.entity.payment.PaymentFactory;
import es.poc.factory.entity.payment.enums.PaymentType;

/**
 *
 * @author bgd
 */
public class Factory {

    public static void main(String[] args) {
        //Payment factory inialization
        PaymentFactory paymentFactory = new PaymentFactory();
        
        // Creation of the different types of Payment by the PaymentType Enum
        Payment paymentVisa = paymentFactory.getPayment(PaymentType.VISA);
        System.out.println(paymentVisa.howAmI());
        
        Payment paymentPayPal = paymentFactory.getPayment(PaymentType.PAYPAL);
        System.out.println(paymentPayPal.howAmI());
        
        System.out.println(paymentFactory.getPayment(PaymentType.GOOGLE_PAY).howAmI());
        
        System.out.println(paymentFactory.getPayment(PaymentType.APPLE_PAY).howAmI());
        
    }
}
