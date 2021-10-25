package com.theswastika.womenhomescreen;

public class Product {
    private int id;
    private String title;

    private int image;

    public Product(int id, String title, int image) {
        this.id = id;
        this.title = title;

        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }



    public int getImage() {
        return image;
    }
}
