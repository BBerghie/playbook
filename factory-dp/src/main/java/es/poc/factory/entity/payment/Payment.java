/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package es.poc.factory.entity.payment;

import es.poc.factory.entity.payment.pojo.BasePaymentPOJO;
import java.util.HashSet;

/**
 *
 * @author bgd
 * @param <T>
 */
public interface Payment<T extends BasePaymentPOJO> {
    String howAmI();
    
    boolean setPayment(T paymentPOJO);
   
    HashSet<T> getSetOfPayments(long id);
}
