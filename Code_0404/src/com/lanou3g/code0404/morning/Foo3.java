package com.lanou3g.code0404.morning;

/**
 * 重载
 * java 在一个类中 允许出现方法名相同
 * 但是参数列表不同的几个方法
 * 这种特性叫 重载
 * <p>
 * 重载的条件:
 * 1. 方法名相同
 * 2. 参数列表不同
 *       1.参数个数不同
 *       2.参数类型不同
 */
public class Foo3 {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    float add(float num1, float num2) {
        return num1 + num2;
    }


}
