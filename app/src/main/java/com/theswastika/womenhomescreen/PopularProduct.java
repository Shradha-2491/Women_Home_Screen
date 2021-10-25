package com.theswastika.womenhomescreen;

public class PopularProduct {
    Integer popularPhoto;
    String popularTitles;
    String popularPrice;

    public PopularProduct(Integer popularPhoto, String popularTitles, String popularPrice){
        this.popularPhoto = popularPhoto;
        this.popularTitles = popularTitles;
        this.popularPrice = popularPrice;
    }

    public Integer getPopularPhoto() {
        return popularPhoto;
    }

    public String getPopularTitles() {
        return popularTitles;
    }

    public String getPopularPrice() {
        return popularPrice;
    }
}
