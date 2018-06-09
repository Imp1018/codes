package com.lanou3g.code0413.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流
 * 在使用IO流的时候 一定要注意
 * 使用完成后 需要关闭IO流
 * 关闭的代码 必须写在finally中
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("out.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fos = null;
        try {
            // 在输出流构造方法的第二个参数 传入 true
            // 代表 写入的文件在原文件的后面添加
            fos = new FileOutputStream(file,true);
            // \ 叫做转义字符 把一个字符原有的含义抹杀
            // 和\ 一同组成新的含义 例如 \n 表示换行
            // \ 表示 tab键
            // \" 表示 "
            String data = "Hello World";
            //  在向文件中写数据
            //  只能写字节类型的数据
            //  字符串也需要转换成 字节数组
            fos.write(data.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
