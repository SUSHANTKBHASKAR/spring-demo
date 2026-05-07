package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDISecond {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("spring-config4.xml");
        Parts bp = container.getBean(MotorBikeParts.class);
        bp.startEngine();
    }
}
