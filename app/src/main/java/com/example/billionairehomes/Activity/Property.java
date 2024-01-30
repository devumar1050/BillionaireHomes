package com.example.billionairehomes.Activity;
public class Property {
    private int imageResourceId;
    private String name;
    private double rating;
    private String price;
    private String location;
    private String size;

    public Property(int imageResourceId, String name, double rating, String price, String location, String size) {
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.location = location;
        this.size = size;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public String getSize() {
        return size;
    }
}

