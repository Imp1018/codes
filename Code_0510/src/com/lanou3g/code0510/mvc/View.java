package com.lanou3g.code0510.mvc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by dllo on 18/5/10.
 */
public class View {
    private Controller controller;

    public void login() {
        controller.login();
    }

    public View() {
        Properties properties = new Properties();
        try {
            InputStream is = new FileInputStream("conf.properties");
            properties.load(is);
            // 通过反射来创建对象
            String ClazzName = properties.getProperty("controller");
            Class Clazz = Class.forName(ClazzName);
            controller = (Controller) Clazz.newInstance();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        View view = new View();
        view.login();
    }
}
