package com.mock.user_signup_kata.domain;

public class User {

    private String name;
    private String surname;
    private int phoneNumber;
    private String functionalDiversity;
    private String email;

    public User(String name, String surname, int phoneNumber, String functionalDiversity, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.functionalDiversity = functionalDiversity;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
