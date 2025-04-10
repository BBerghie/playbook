/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.poc.factory.entity.payment.impl;

import es.poc.factory.entity.payment.Payment;

/**
 *
 * @author bgd
 */
public class VisaPayment implements Payment {

    @Override
    public String howAmI() {
        return VisaPayment.class.getName();
    }
}
