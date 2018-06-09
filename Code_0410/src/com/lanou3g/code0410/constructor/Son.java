package com.lanou3g.code0410.constructor;

/**
 * 当A 继承 B 的时候 new A的对象时 java会在内部自动的创建B(A的父类)的对象
 * 并且先执行B(父类)的构造方法 在执行A(子类)的构造方法
 * 这个过程 是我们控制不了的
 *
 * 那么如果B(父类)没有默认构造方法 则A(子类)必须使用super(参数)的方式
 * 在自己的构造方法第一行 显示调用父类的构造方法
  */
public class Son extends Father{
    public Son(String name) {
        super(name);

    }
}
