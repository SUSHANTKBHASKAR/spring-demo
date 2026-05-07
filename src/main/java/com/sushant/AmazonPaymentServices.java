package com.sushant;

public class AmazonPaymentServices {
    private final Payment payment;

    AmazonPaymentServices(Payment payment){
        this.payment = payment;
    }

    public void checkout(){
        payment.pay();
        System.out.println("Order Placed....");
    }
}
