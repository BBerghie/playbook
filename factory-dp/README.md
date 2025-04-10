# Factory Design Pattern.

java 21 & Apache Maven 3.8.7 

## Identification of similar entities
Paypal, Visa, Google and Apple 

## Payment interfacte and the Payment contract
Creating an abstraction of the “payment” entity that will define the basic contract that makes a PaymentEntity work

In this little poc, only one function (`howAmI`) it will be defined on the Payment interface and the implementation on the subclases will scope the subclase's className. 
In a real implementation that function might be the way that any payment method could connect to the bank to process a payment.

```java
/**
 *
 * @author bgd
 */
public interface Payment {
    String howAmI();
}
```

//TODO
## A way to differentiate between payment methods
Enum

//TODO
## implementations
//TODO
## Factory

## The final result

Result: 

```
--- exec:3.1.0:exec (default-cli) @ factory ---
es.poc.factory.entity.payment.impl.VisaPayment
es.poc.factory.entity.payment.impl.PayPalPayment
es.poc.factory.entity.payment.impl.GooglePayment
es.poc.factory.entity.payment.impl.ApplePayment
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  1.140 s
Finished at: 2025-03-29T00:38:40+01:00
------------------------------------------------------------------------
```


## Why?
