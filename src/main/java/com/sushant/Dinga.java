package com.sushant;

public class Dinga {

    Linga linga;

    public Dinga() {
        System.out.println("Default constructor called");
    }

    public Dinga(Linga linga){
        this.linga = linga;
    }

    public void setLinga(Linga linga){
        this.linga = linga;
    }

    void developing(){
        linga.work();
        System.out.println("Dinga is developing something...");
    }
}