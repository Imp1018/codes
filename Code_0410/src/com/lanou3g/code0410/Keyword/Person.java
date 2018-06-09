package com.lanou3g.code0410.Keyword;

/**
 * Created by dllo on 18/4/10.
 */


     // 如果一个类写上了final
     // 那么他就不能被继承
public  class Person {

    //  如果一个方法加上了final
    //  那么子类是无法覆写这个方法的
    public  void study(){

        // 变量加final 则变量 只能赋值一次
        final int a=3;

        System.out.println("学习");
    }
}
