package com.sushant;

public class Car {
    Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }
    void ride(){
        engine.start();
        System.out.println("Now you can ride with your car...");
    }
}
