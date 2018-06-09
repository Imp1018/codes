package com.lanou.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tire {
    @Value("30")

    private int size;

//    public Tire(int size) {
//        this.size = size;
//    }

    public int getSize() {
        return size;
    }

    public Tire setSize(int size) {
        this.size = size;
        return this;
    }
}
