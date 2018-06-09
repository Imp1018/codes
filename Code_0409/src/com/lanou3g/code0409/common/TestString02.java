package com.lanou3g.code0409.common;

import java.util.Scanner;

/**
 * Created by dllo on 18/4/9.
 */
public class TestString02 {
    public static void main(String[] args) {
        //  判断对象类型的相等 永远不要使用  ==
        //  == 只能用来判断基本数据类型是否相等
        // 判断两个对象是否相等 使用 equal方法
        // 所有对象都有这个方法
        String s = "Hello";

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line == s);

        System.out.println(s.equals(line));
    }
}
