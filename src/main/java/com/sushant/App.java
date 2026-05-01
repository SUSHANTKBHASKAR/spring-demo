package com.sushant;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext container =
                new ClassPathXmlApplicationContext("spring-config.xml");
        BeanDemo bean = container.getBean(BeanDemo.class);
        bean.add(4,5);

    }
}
