package com.sushant;

//Singleton class
public class DBConnection {
    private String Connection;
    private String username;
    private String password;

    //Step 1: make the constructor as private
    private DBConnection(String Connection, String username, String password){
        this.Connection = Connection;
        this.username = username;
        this.password = password;
    }
    //Create a method that will return only 1 object
    private static DBConnection dbConnection;//null
    public static DBConnection getDBConnection() {
        if(dbConnection==null){//1st time it is true
            dbConnection = new DBConnection("MySQL" , "root" , "root");
        }
        return dbConnection;
    }
}
