package com.lanou3g.hw0518.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class VerifyCode {
    private Random random = new Random();
    private int w = 120;//宽
    private int h = 40;//高
    private String codes = "ABCDEFGHJKLMNPRSTWXY3456789";
    private String text = "";//要生成的验证码图片

    //随机生成颜色
    private Color randomColor() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r, g, b);
    }

    private void drawLine(Graphics2D g2) {
        g2.setColor(randomColor());
        int x1 = random.nextInt(w);
        int y1 = random.nextInt(h);
        int x2 = random.nextInt(w);
        int y2 = random.nextInt(h);
        g2.drawLine(x1, y1, x2, y2);
    }

    private Font randomFont() {
        int style = random.nextInt(3);
        int size = random.nextInt(10) + 16;
        return new Font(null, style, size);
    }

    private String randomString() {
        char c = codes.charAt(random.nextInt(codes.length()));
        return String.valueOf(c);
    }

    public BufferedImage getImage() {
        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        //设置背景
        Graphics2D g2 = (Graphics2D) image.getGraphics();

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, w, h);

        //绘制文字
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            String s = randomString();
            float x = i * 1.0f * w / 4 + 10;
            float y = h - 10;
            Color color = randomColor();
            Font font = randomFont();
            g2.setColor(color);
            g2.setFont(font);
            g2.drawString(s, x, y);
            builder.append(s);
        }
        text = builder.toString();
        //绘制干扰线
        for (int i = 0; i < random.nextInt(3) + 3; i++) {
            drawLine(g2);
        }
        return image;
    }

    public String getText() {
        return text;
    }


    public void out(BufferedImage image, OutputStream os) {
        try {
            ImageIO.write(image, "JPEG", os);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
