package com.example.billionairehomes.Activity;

public class House {
    private int imageResourceId;
    private String location;
    private int rating;
    private String price;
    private String address;

    public House(int imageResourceId, String location, int rating, String price, String address) {
        this.imageResourceId = imageResourceId;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.address = address;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getLocation() {
        return location;
    }

    public int getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }
}
