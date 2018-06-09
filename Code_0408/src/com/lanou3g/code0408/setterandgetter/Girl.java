package com.lanou3g.code0408.setterandgetter;

/**
 * 以后 记住:
 * 1.类中的所有属性 都是private的
 * 2.每个属性都提供一对 setXXX 和  getXXX 的方法 我们叫它 set/get 方法 (XXX是属性名)
 * 3.set方法用来为这个属性进行赋值
 * 4.get方法用来获取这个属性的值
 */
//  mac:command+n
//  windows: alt+insert

public class Girl {
    private int age;
    private String name;
    private float weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
