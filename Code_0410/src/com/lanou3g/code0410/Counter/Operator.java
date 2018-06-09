package com.lanou3g.code0410.Counter;

/**
 * 抽象了两个整数的计算
 */
public class Operator {
    //   子类覆写父类方法的时候
    //   必须保证 权限>= 父类的权限
    //   这样能调用到父类方法的*地方*
    //   在那也能调用到子类的方法
    //   才能保证 父类引用指向子类对象时 不会出问题
    public int compute(int num1,int num2){
        // 两个整数的计算
        // 只有方法体内的东西不同
        // 接收的参数 和 返回值一定都是整数
        // 但是具体计算方式 没办法写
        return 0;
    }
}
