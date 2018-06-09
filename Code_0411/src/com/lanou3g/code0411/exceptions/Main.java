package com.lanou3g.code0411.exceptions;

import com.lanou3g.code0411.MyArray;

/*
        java提供了一种机制 来解决代码出错的问题
        例如:计算除法时 除数为0 或者一个对象没有new就去使用
        或者 我们要读取文件 但是文件并不存在

        */
public class Main {
    public static void main(String[] args) {
        //通过try-catch代码块 我们可以捕获任何一个异常
        //如果try代码块中 有任何代码出现异常
        //并且 这个异常 时catch小括号内 声明的异常
        //那么这个异常 就会被捕获 程序不会停止运行
        //而是转为执行 catch代码块内的代码

        //所有的异常 通过throw 关键字抛出
        //throw+异常对象
//        try {
//            int a = 3 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("除数为0");
//        }
//        System.out.println("程序不会崩溃,会继续执行");

        MyArray<String> stringMyArray = new MyArray<>();
        stringMyArray.put("A");
        stringMyArray.put("B");

        String s = stringMyArray.get(10);
        System.out.println("程序结束");

    }
}