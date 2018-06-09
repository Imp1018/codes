package com.lanou3g.code0427.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by dllo on 18/4/27.
 */
public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.properties");
            properties.load(fis);//建立起了配置对象和配置文件的联系
            //通过配置文件中的key 来 拿到value
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            System.out.println(username + "-" + password);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
