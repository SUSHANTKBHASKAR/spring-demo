package com.sushant;

//initializing data members/property values via constructor
public class BeanDemo3 {
    private int id;
    private String name;

    public BeanDemo3(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void add(int a, int b){
        System.out.println("addition: "+(a+b));
    }
}
