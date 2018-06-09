package com.lanou3g.code0410;

/**
 * 继承: 面向对象的三大基本特征之一
 * 表示一个类 在另一个类的 基础上进行开发
 * 关键字: extends (有继承 扩展的含义)
 * 语法: class A extends B{}
 * 表示 A这个类 实在 B这个类的基础上 进行开发的
 * 那么A这个类 就会有B中 所有的 属性和方法 注意是所有的
 * 这时A叫做B的子类 B叫A的父类(超类)
 */
public class Cat extends Animal {
    public void sellMoe() {
        System.out.println("在卖萌");
    }

    @Override
    /**
     * 是来表明某个方法时覆写其父类的方法
     * 当在一个方法前 添加@Override之后 idea就会自动的监测
     * 这个方法 在其父类中是否存在 如果存在 则构成覆写
     * 如果不存在 就会画红线来提示你 这个方法要么方法名写错了 要么参数列表写错了
     * @Override 并不是 覆写的必要条件 只是用来标记的
     */
    public void shout() {
        System.out.println("喵喵");
    }

    public void fun() {
        this.shout();// 喵喵
        /**
         * super:
         * 1.指的是父类对象
         * 当在调用一个方法的时候:java首先会在当前类中寻找该方法
         * 如果找不到 则在父类中寻找
         *
         * 如果我们想指定调用父类中的方法 则需要写super中的关键字
         */
        super.shout();// 叫
    }
}
