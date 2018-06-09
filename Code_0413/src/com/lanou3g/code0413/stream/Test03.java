package com.lanou3g.code0413.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dllo on 18/4/13.
 */
public class Test03 {
    public static void main(String[] args) {
        File file = new File("out.txt");

        FileInputStream fis=null;
        try {
            fis=new FileInputStream(file);
            // 创建一个数组 从文件中读取内容
            // 就放到这个数组中
            // 数组大小没有任何要求
            // 通常都是1024(1KB)或者10*1024(10KB)
            byte[] buf=new byte[1024];
            int num=0;
            StringBuilder sb=new StringBuilder();
            while ((num=fis.read(buf))!=-1){
                // 从字节数组 生成一个 字符串
                String data=new String(buf,0,num);
                sb.append(data);
            }
             // 拿到最后的数据
            String result=sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
