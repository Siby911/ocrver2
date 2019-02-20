package com.example.exam.ocr_ver2;


public class user {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;
    //public String email;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public user() {
    }

    public user(String name) {
        this.name = name;
       // this.email = email;
    }
}