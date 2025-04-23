/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.poc.factory.entity.payment.pojo;

import es.poc.factory.entity.payment.enums.PaymentType;

/**
 *
 * @author dbgd
 */
public abstract class BasePaymentPOJO{

    long paymnetId;
    PaymentType paymentType;

    public BasePaymentPOJO(long paymnetId, PaymentType paymentType) {
        this.paymnetId = paymnetId;
        this.paymentType = paymentType;
    }
    
    public long getPaymnetId() {
        return paymnetId;
    }

    public void setPaymnetId(long paymnetId) {
        this.paymnetId = paymnetId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
