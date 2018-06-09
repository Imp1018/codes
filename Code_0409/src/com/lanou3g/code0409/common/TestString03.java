package com.lanou3g.code0409.common;

/**
 * String 是字符串常量,是出生了就不可能改变的量
 * 当我们使用+号在 拼接字符串的时候,实际上发生了如下事件
 * 1. 在编译时,Java检测到你要拼接字符串了
 * 2. 在需要拼接的部位,创建一个StringBuilder
 * 3. 使用StringBuilder的append方法来拼接字符串
 * 4. 通过toString得到拼接后的值
 * 5. 将得到的指 赋值给原来的String变量
 */

public class TestString03 {
    public static void main(String[] args) {
        long a = System.nanoTime();
        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        sb.append("World");
        s = sb.toString();

        for (char c = 'A'; c <= 'Z'; c++) {
            StringBuilder sb1 = new StringBuilder(s);
            sb1.append(c);
            s = sb1.toString();
        }
        System.out.println(s);
        long b = System.nanoTime();
        System.out.println(b - a);
        //以后 在 循环内拼接字符串
        //务必使用StringBuilder/StringBuffer(还没讲)


        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World");
        for (char c = 'A'; c <= 'Z'; c++) {
            stringBuilder.append(c);
        }
        String result = stringBuilder.toString();
        System.out.println(result);
        long c = System.nanoTime();
        System.out.println(c - b);
    }
}