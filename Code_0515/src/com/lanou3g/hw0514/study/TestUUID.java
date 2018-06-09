package com.lanou3g.hw0514.study;


import org.junit.Test;

import java.util.UUID;

public class TestUUID {
    @Test

    public void fun() {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }

    public static String getRandomString() { //转成字符串        // 去掉 -                   // 转成大写字母
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        return uuid;
    }

    public static String handleFileName(String filename) {
        String name = getRandomString();//获取uuid
        // 找到最后一个. 的下标
        int lastIndex = filename.lastIndexOf(".");
        String expand = filename.substring(lastIndex, filename.length());
        return name + expand;  // 拼接成新的 文件名
    }

    @Test
    public void test1() {
        String newName = handleFileName("aaa.png");
        System.out.println(newName);
    }

}
