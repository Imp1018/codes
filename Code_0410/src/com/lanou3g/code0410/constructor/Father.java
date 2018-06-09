package com.lanou3g.code0410.constructor;

/**
 * Created by dllo on 18/4/10.
 */
public class Father {
    private String name;
    private int age;

    public Father(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
