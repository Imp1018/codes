package com.lanou.entity;

public class Dog {
    private String name;
    private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Dog setColor(String color) {
        this.color = color;
        return this;
    }
}
