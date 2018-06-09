package com.lanou3g.code0413.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dllo on 18/4/13.
 */
public class CopeTest {
    public static void main(String[] args) {
        String srcPath = "/Users/dllo/Desktop/aaa.jpg";    // 我们要复制的文件
        String desPath = "/Users/dllo/Desktop/bbb.jpg";    // 我们要复制到的文件(新文件)

        File srcFile = new File(srcPath);
        File desFile = new File(desPath);

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            desFile.createNewFile();
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(desFile);

            byte[] buf = new byte[1024];

            int b = 0;

            while ((b=fis.read(buf))!=-1){
                // 写到输出流里   从0到b的长度
                fos.write(buf,0,b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
