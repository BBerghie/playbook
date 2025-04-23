/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.poc.factory.entity.payment.impl;

import es.poc.factory.entity.payment.Payment;
import es.poc.factory.entity.payment.pojo.concrete.ApplePayPOJO;
import lombok.extern.log4j.Log4j2;

import java.util.HashSet;

/**
 * @author bgd
 */
@Log4j2
public class ApplePayment implements Payment<ApplePayPOJO> {

    @Override
    public String howAmI() {
        return ApplePayment.class.getName();
    }

    @Override
    public boolean setPayment(ApplePayPOJO paymentPOJO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HashSet<ApplePayPOJO> getSetOfPayments(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

