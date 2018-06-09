package com.lanou3g.code0510.reflection;

/**
 * Created by dllo on 18/5/10.
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age - 5;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println("构造方法被调用");
    }
    public void show(){
        System.out.println(name+":"+age);
    }
}
