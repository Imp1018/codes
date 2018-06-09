package com.lanou3g.code0413.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by dllo on 18/4/13.
 */
public class Main {
    public static void main(String[] args) {
        // 创建文件对象时
        // 可以在构造方法中 传入 文件名
        // 无论这个文件是否存在
        // 相对路径&绝对路径
        // 如果一个文件名前 啥也没有 那么就是相对路径
        // 或者说是字母开头 就是相对路径
        // 即 路径是以 当前项目的根路径开始计算的
        // 正常开发时 基本上使用的都是相对路径
        // File file = new File("aaa.txt");
        // File file = new File("src/aaa.txt");
        // 如果 没有这个路径,在创建文件的时候 就会失败
        String path="/Users/dllo/Desktop/代码 作业/课堂代码/Code_0413/res/txt";
        // 不同的操作系统下 文件夹的分隔符是不同的
        // 可以使用File.separator来 分割
        // 它可以动态的去 变成适当的分隔符
        // windows: \  mac或linux: /
        File file = new File(path+File.separator+"bbb.txt");
        try {
            //  创建一个新的文件
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
