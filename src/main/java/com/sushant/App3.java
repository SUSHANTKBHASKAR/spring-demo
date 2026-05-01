package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args){
        ApplicationContext container =
                new ClassPathXmlApplicationContext("spring-config3.xml");
        BeanDemo3  bean3 = container.getBean(BeanDemo3.class);
        //this time spring will create the object and initialize the value
        System.out.println(bean3.getId()+" "+bean3.getName());
        bean3.add(4,5);
    }
}
