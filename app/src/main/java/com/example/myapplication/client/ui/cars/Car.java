package com.example.myapplication.client.ui.cars;

public class Car {
    private int image;
    private String title;
    private int price;

    public Car(int image, String title, int price) {
        this.image = image;
        this.title = title;
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

}
