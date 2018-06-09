package com.lanou3g.code0427.view;

import com.lanou3g.code0427.controller.Controller;
import com.lanou3g.code0427.pojo.User;

import java.util.Scanner;

/**
 * Created by dllo on 18/4/27.
 */
public class View {
    private Controller controller;

    public View() {
        // 在构造方法中 创建Controller对象
        controller = new Controller();
    }

    public void showMenu() {
        System.out.println("*****************");
        System.out.println("1.注册:");
        System.out.println("2.登录:");
        System.out.println("*****************");
    }

    //   接收用户输入
    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
//        scanner.close();
        return choice;
    }
    // 登录
    public User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.nextLine();
        System.out.println("请输入密码:");
        String pwd = scanner.nextLine();
        // 调用controller去登录
        User user = controller.login(username, pwd);
//        scanner.close();
        return user;
    }
      // 注册
    public boolean register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.nextLine();
        System.out.println("请输入秘密:");
        String pwd = scanner.nextLine();
        System.out.println("请输入一句话:");
        String word = scanner.nextLine();

        boolean isSucc = controller.register(username, pwd, word);
//        scanner.close();
        return isSucc;
    }
    // 打印一句话
    public void showWord(User user) {
        System.out.println(user.getWord());
    }
}
