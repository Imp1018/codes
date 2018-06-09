package com.lanou3g.hw0518.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        //创建图片的框
        BufferedImage image = new BufferedImage(300, 150, BufferedImage.TYPE_INT_RGB);
        //使用画笔进行绘制图片
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        //绘制背景
        graphics.setColor(new Color(122, 130, 255));
        graphics.fillRect(0, 0, 300, 150);


        graphics.setColor(new Color(130, 62, 52));
        //绘制字符串时  横坐标是字符串左边
        //纵坐标指的是基线纵坐标
//        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        graphics.setFont(new Font(null,3,15));
        graphics.drawString("pP",50,50);
        graphics.setColor(Color.WHITE);


        File file = new File("aaa.jpg");
        try {

            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            OutputStream os = new FileOutputStream("aa.jpg");

            ImageIO.write(image, "JPEG", os);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
