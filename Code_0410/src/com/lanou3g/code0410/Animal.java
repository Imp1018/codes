package com.lanou3g.code0410;

/**
 * Created by dllo on 18/4/10.
 */
public class Animal {
    private String kind;  // 种类

    public void eat() {
        System.out.println(kind+"在吃饭");
    }

    public void shout() {
        System.out.println("叫");
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
