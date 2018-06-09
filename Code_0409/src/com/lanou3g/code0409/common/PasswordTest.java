package com.lanou3g.code0409.common;

import java.util.Scanner;

/**
 * Created by dllo on 18/4/9.
 */
public class PasswordTest {
    public static void main(String[] args) {
        System.out.println("请输入密码");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();  //接收用户输入的一行信息  类型是String
        // 判断长度
        if (password.length() < 8) {
            System.out.println("密码长度不够8位");
            return;
        }
        // 判断数字   1和"1"是不一样的
        boolean hasNum = false;
        for (int i = 0; i < 10; i++) {
            // String.valueOf(基本数据类型)
            // 可以把任意的基本数据类型 变成字符串
            if (password.contains(String.valueOf(i))) {
                // 10次循环 只要 有一次 进入这个if中 就证明 密码中有数字
                hasNum = true;
            }

        }
        if (!hasNum) {
            // 如果没有数字
            // 即 hasNum=false
            System.out.println("没有数字");
            return;
        }

        //  判断是否包含大写字母
        //  ASCII 阿斯克
        boolean j = false;

        for (char c = 'A'; c <= 'Z'; c++) {


            if (password.contains(String.valueOf(c))) {
                j = true;
            }
        }
        if (!j) {
            System.out.println("没有大写字母");
            return;
        }
        boolean k = false;
        for (char b = 'a'; b <= 'z'; b++) {
            if (password.contains(String.valueOf(b)))
                k = true;
        }
        if (!k) {
            System.out.println("没有小写字母");
            return;
        }
        System.out.println("密码合法");
    }
}
