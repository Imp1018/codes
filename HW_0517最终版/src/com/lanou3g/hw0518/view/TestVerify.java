package com.lanou3g.hw0518.view;

import com.lanou3g.hw0518.util.VerifyCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestVerify {
    public static void main(String[] args) throws RuntimeException, IOException {
        VerifyCode verifyCode = new VerifyCode();
        BufferedImage image = verifyCode.getImage();

        File file = new File("aa.jpg");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        OutputStream os = new FileOutputStream(file);
        verifyCode.out(image, os);
        String text = verifyCode.getText();
        System.out.println(text);

    }
}
