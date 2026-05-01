package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanDemo.class);

        BeanDemo bean = context.getBean(BeanDemo.class);
        bean.add(6, 3);
    }
}
