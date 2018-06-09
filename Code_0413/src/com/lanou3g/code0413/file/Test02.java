package com.lanou3g.code0413.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by dllo on 18/4/13.
 */
public class Test02 {
    public static void main(String[] args) {
        //  文件夹下的相对路径
        File parentpath = new File("res/txt/abc/cba");
        //    创建文件夹
        parentpath.mkdirs();
        File file = new File(parentpath, "aaa.txt");
        //  判断文件是否存在 存在为true
        //  不存在 为false
        boolean exists = file.exists();
        System.out.println(exists);
        if (exists) {
            file.delete();    //删除文件
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
