package com.lanou3g.code0408.constructor;

/**
 * 构造方法使用的场景:
 *   1. 为了限定对象中必须有某种属性
 *   会写上构造方法 并对这个属性进行赋值
 *   这样 该类中就没有 无参的构造方法了
 *   就可以保证 该属性一定是有值的

 */
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
