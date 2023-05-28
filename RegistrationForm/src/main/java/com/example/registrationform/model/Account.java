package com.example.registrationform.model;

public class Account {
    private String Username;
    private String password;

    public Account() {

    }

    public Account(String username, String password){
        this.Username = username;
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
