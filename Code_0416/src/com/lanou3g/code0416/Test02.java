package com.lanou3g.code0416;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by dllo on 18/4/16.
 */
public class Test02 {
    public static void main(String[] args) {
        File file = new File("Test.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            // 缓存数据
            byte[] buf = new byte[3];
            int pos = 0;
            StringBuilder sb = new StringBuilder();
            while ((pos = bis.read(buf)) != -1) {
                String data = new String(buf, 0, pos);
                sb.append(data);
            }
            String result = sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeAll(bis);
        }
    }
}
