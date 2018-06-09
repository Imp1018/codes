package com.lanou3g.code0427;

import com.lanou3g.code0427.pojo.User;
import com.lanou3g.code0427.view.View;

/**
 * Created by dllo on 18/4/27.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        while (true) {
            // 1. 显示菜单
            view.showMenu();
            // 2. 让用户选择
            int choice = view.getUserChoice();
            //  根据用户选择  注册 登录
            switch (choice) {
                case 1:  // 注册
                    boolean registerSucc = view.register();
                    if (registerSucc) {
                        System.out.println("注册成功");
                    } else {
                        System.out.println("注册失败");
                    }
                    break;
                case 2:  // 登录
                    User user = view.login();
                    if (user != null) {
                        view.showWord(user);
                        return;   // 整个程序结束
                    } else {
                        System.out.println("登录失败");
                    }
                    break;
            }
        }
    }
}
