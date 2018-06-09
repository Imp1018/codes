package com.lanou.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Framework {
    @Autowired
    private Bottom bottom;

//    public Framework(Bottom bottom) {
//        this.bottom = bottom;
//    }

    public Bottom getBottom() {
        return bottom;
    }

    public Framework setBottom(Bottom bottom) {
        this.bottom = bottom;
        return this;
    }
}
