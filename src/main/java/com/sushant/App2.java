package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args){
        ApplicationContext container =
                new ClassPathXmlApplicationContext("spring-config2.xml");
        BeanDemo2 bean2 = container.getBean(BeanDemo2.class);
        //this time spring will create the object and initialize the value
        System.out.println(bean2.getId()+" "+bean2.getName());
        bean2.add(4,5);
    }
}
