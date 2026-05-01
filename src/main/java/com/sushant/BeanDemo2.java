package com.sushant;

//initializing property values via setter method
public class BeanDemo2 {
    private int id;
    private String name;
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(int a, int b){
        System.out.println("addition: "+(a+b));
    }
}
