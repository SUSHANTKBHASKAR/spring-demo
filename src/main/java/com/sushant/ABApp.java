package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class ABApp {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("spring-config7.xml");
        A a  = container.getBean(A.class);
        a.m1();
    }
}
