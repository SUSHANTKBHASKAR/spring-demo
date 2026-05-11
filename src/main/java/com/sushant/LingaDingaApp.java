package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LingaDingaApp {
    public static void main(String[] args){
        //Spring Container is also IOC Container
        //is response to create object and inject it.
        //in spring there are three types of container.
        //BeanFactory super container
        //ApplicationContext child container of BeanFactory
        //webApplicationContext child Container of ApplicationContext

        ApplicationContext container = new ClassPathXmlApplicationContext("spring-config6.xml");
        Dinga dinga = container.getBean(Dinga.class);
        dinga.developing();
    }
}
