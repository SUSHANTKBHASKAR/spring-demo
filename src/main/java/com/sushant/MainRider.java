package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRider {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("spring-config5.xml");
        Car c = container.getBean(Car.class);
        c.ride();
    }
}
