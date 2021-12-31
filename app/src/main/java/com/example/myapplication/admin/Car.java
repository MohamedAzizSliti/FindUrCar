package com.example.myapplication.admin;

public class Car {

   private int image;
   private String title, detail, state;

    public Car(int image, String title, String detail, String state) {
        this.image = image;
        this.title = title;
        this.detail = detail;
        this.state = state;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public String getState() {
        return state;
    }
}
