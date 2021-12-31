package com.example.myapplication.admin;

public class User {
    private int image;
    private String name,type;

    public User(int image, String name, String type) {
        this.image = image;
        this.name = name;
        this.type = type;
    }
    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }



}
