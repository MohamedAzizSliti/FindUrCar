package com.example.myapplication.admin;

public class Agence {
    public Agence(int image, String name, String location) {
        this.image = image;
        this.name = name;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    private int image;
    private String name,location;
}
