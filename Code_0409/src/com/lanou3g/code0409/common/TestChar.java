package com.lanou3g.code0409.common;

/**
 * 判断是否包含大写字母
 * ASCII 阿斯克
 */
public class TestChar {
    public static void main(String[] args) {
        char a = 'A';
        int a1 = 65;
        char b = (char) 65;//把65强制类型转换成char
        int b1 = (int) 'A';
        System.out.println(b);
//        for (int i = 65; i < 91; i++) {
//            char c = (char) i;
//            System.out.println(c);
//        }
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
    }
}
