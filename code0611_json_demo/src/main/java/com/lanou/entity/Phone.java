package com.lanou.entity;


public class Phone {
    private String brand;
    private String model;
    private Double price;

    public String getBrand() {
        return brand;
    }

    public Phone setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Phone setModel(String model) {
        this.model = model;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Phone setPrice(Double price) {
        this.price = price;
        return this;
    }
}
