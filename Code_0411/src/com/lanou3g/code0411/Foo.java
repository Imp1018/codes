package com.lanou3g.code0411;

/**
 * 泛型 <>
 * 可以用在类上
 * 可以用在方法上
 * 类:
 * 在类名后使用<任意字母>叫做声明泛型
 * 任意字母: 命名规范同类名 即 首字母大写 且 驼峰结构
 * 特别的尽量短一些 可以使用一个字母 通常使用 T, T是Type的首字母
 *
 * 如果泛型类 需要使用多个泛型 使用<A,B>这种形式
 */
public class Foo<T> {
    /*
    * 在 类上 声明的泛型 可以在这个类中使用
    * 即 在这个类中 T就好像是真的写了一个类一样
    *
    * */

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
