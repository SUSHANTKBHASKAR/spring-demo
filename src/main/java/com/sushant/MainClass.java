package com.sushant;

public class MainClass {
    public static void main(String[] args){
        DBConnection db1 = DBConnection . getDBConnection();
        DBConnection db2 = DBConnection . getDBConnection();
        DBConnection db3 = DBConnection . getDBConnection();
        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
    }
}
