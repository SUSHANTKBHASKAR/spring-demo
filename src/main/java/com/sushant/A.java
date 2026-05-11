package com.sushant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    B b;
    void m1(){
        b.m2();
        System.out.println("Execute m1() of A class");
    }
}
