package com.lanou3g.code0409.common;

import java.util.Scanner;

/**
 * Created by dllo on 18/4/9.
 */
public class RepeatTest {
    public static void main(String[] args) {
        //  用户输入两次密码  判断是否一致
        System.out.println("请输入密码:");
        Scanner scanner = new Scanner(System.in);
        String psw = scanner.nextLine();
        System.out.println("请输入确认密码:");
        String psw1 = scanner.nextLine();
        if (psw.equals(psw1)) {
            System.out.println("密码一致");
        } else {
            System.out.println("密码不一致");
        }
    }
}
