package com.lanou3g.code0413.file;

import java.io.File;

/**
 *          IO流
 */
public class Test03 {
    public static void main(String[] args) {
        File dir = new File("res/txt/abc/cba");
        //判断一个File是否是文件夹
        //true 是文件夹
        //false 不是文件夹
        boolean directory = dir.isDirectory();
        System.out.println(directory);

        // listFiles 获取当前文件夹下的所有文件
        // dir需要确定的文件夹
        for (File file : dir.listFiles()) {
            String filename = file.getName();
            //  获取文件名
            if (filename.startsWith("a")) {
                file.delete();
            }
            System.out.println(filename);
        }
    }
}
