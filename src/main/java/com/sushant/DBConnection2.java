package com.sushant;

public class DBConnection2 {
    private String Connection;
    private String username;
    private String password;

    public DBConnection2(String Connection, String username, String password){
        this.Connection = Connection;
        this.username = username;
        this.password = password;
    }

    public String getConnection() {
        return Connection;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
