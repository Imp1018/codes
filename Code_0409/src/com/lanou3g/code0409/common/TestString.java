package com.lanou3g.code0409.common;

import java.io.StringReader;

/**
 * String 类相关
 */
public class TestString {
    public static void main(String[] args) {
        // String 我们叫它字符串常量 是专门用来处理文本信息的
        // 所有的双引号 都是字符串


        // 常用方法示例:
        String a = "AaBbCcDd汉字";
        int length = a.length();  // 求字符串的字符个数
        System.out.println(length);

        boolean aa = a.startsWith("Aa");  // 字符串是否是以XX开头
        System.out.println(aa);

        char c = a.charAt(0);   //获取字符串的第几个字符

        a = a.toUpperCase();   //字符串全部转换为大写
        a = a.toLowerCase();  //字符串全部转换为小写

        String b = "张三,9:00,你好";
        //  把字符串用逗号 拆分成 字符串数组 结果中会删除逗号
        //  常用在传输复杂数据时  接收方 把数据按照约定好的 格式 拆开
        String[] result = b.split(",");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

        String d = "A-B-C";
        d = d.replace('-', ',');
        System.out.println(d);

        boolean isContains = d.contains("A");   //判断 字符串中是否包含一个 字符串

        //综合练习
        // 用户输入一个密码 判断是否合法
        // 标准:
        // 1.长度不小于8位
        // 2.需要包含 大写字母/小写字母/数字



    }
}
