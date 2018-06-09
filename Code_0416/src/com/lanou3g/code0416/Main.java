package com.lanou3g.code0416;

import java.io.*;

/**
 * Created by dllo on 18/4/16.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static void copyByBuffer(String srcPath, String desPath) {
        File srcFile = new File(srcPath);
        File desFile = new File(desPath);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            desFile.createNewFile();
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(desFile);
            // bufferedInput/outputStream  创建的时候需要有别的字流节
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            int pos = 0;
            byte[] buf = new byte[1024];

            while ((bis.read()) != -1) {
                bos.write(buf, 0, pos);
            }
            bos.flush();       //在使用bufferedOutputStream的时候
            // 需要在最后 加上一句bos.flush(); 无论 bos里面的数组满没满 都将里面的数据写到硬盘中
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 只需要关闭 bis和bos
            // 会在bis和bos的close方法中
            // 自动的关闭fis和fos
            IOUtils.closeAll(bis, bos);
        }

    }
}
