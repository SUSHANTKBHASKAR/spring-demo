package com.sushant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass2 {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config[demo singleton classes]4.xml");
        DBConnection2 db1 = context.getBean(DBConnection2.class);
        DBConnection2 db2 = context.getBean(DBConnection2.class);
        DBConnection2 db3 = context.getBean(DBConnection2.class);
        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
    }
}
