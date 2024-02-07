package com.example.bv111servlets;

public class Car {
    private String model;
    private String vendor;
    private int price;

    public Car() {
    }

    public Car(String model, String vendor, int price) {
        this.model = model;
        this.vendor = vendor;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
