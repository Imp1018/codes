package com.lanou3g.code0408.permission;

/**
 * this 使用技巧
 * 1. 只要在这个类中 想访问属性 或者调用方法 就在这个属性/方法前 加 this
 * 因为目前没有别的关键字可以加了
 */
public class Woman {
    public String name;
    private int age;
    public String doSth;

    public void birthday() {
        this.age++;     // this.可以省略 效果一样
    }

    public void showSelf() {
        System.out.println("我叫" + name + "今年" + this.age + "岁");
        //   在一个方法中调用其他方法
        this.showSth();
    }

    //   展示才艺
    public void showSth() {
        System.out.println("我在" + this.doSth);
    }
}
