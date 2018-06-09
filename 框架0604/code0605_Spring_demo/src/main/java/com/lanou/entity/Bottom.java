package com.lanou.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bottom {
    @Autowired
    private Tire tire;

//    public Bottom(Tire tire) {
//        this.tire = tire;
//    }

    public Tire getTire() {
        return tire;
    }

    public Bottom setTire(Tire tire) {
        this.tire = tire;
        return this;
    }
}
