/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.poc.factory.entity.payment.impl;

import es.poc.factory.entity.payment.Payment;
import es.poc.factory.entity.payment.pojo.BasePaymentPOJO;
import java.util.HashSet;

/**
 *
 * @author bgd
 */
public class GooglePayment implements Payment {

    @Override
    public String howAmI() {
        return GooglePayment.class.getName();
    }

    @Override
    public boolean setPayment(BasePaymentPOJO paymentPOJO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HashSet getSetOfPayments(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
