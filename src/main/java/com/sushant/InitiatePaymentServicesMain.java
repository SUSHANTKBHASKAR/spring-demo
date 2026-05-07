package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitiatePaymentServicesMain {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("spring-payment-config.xml");
        AmazonPaymentServices aps =container.getBean(AmazonPaymentServices.class);
        aps.checkout();
    }
    
    
}
