package com.lanou3g.code0416;

import java.io.*;

/**
 * Created by dllo on 18/4/16.
 */
public class Test03 {
    public static void main(String[] args) {
        read();
        write();
    }

    public static void write() {
        File file = new File("Test.txt");
        // BufferedWriter 还是不方便
        // 写文本的时候 通常使用PrintWriter
        PrintWriter pw = null;
        OutputStreamWriter osw = null;
        FileOutputStream fos = null;


        try {
            // 是否是追加模式
            // 根据FileOutputStream来走
            // 再加一个true 参数 就是追加模式
            fos = new FileOutputStream(file, true);
            osw = new OutputStreamWriter(fos);
            pw = new PrintWriter(osw);
            //  写入文件的时候 用法跟system.out一样
            pw.println(1);
            pw.println("看电视剧法律束带结发");
            pw.println("jjkdsfljdsfijdfsdndsjfoihdfsfd");
            pw.print("速度快放假爱丽丝肯定就发了多少块腹肌");
            pw.print(131.245453454);

            pw.flush();// 全部写完之后务必加上flush 养成好习惯

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeAll(pw);
        }
    }


    // 使用字符流读取文本信息
    public static void read() {
        File file = new File("Test.txt");
        BufferedReader reader = null;
        InputStreamReader isr = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            reader = new BufferedReader(isr);

            String line = "";
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // 如果最后的结果
                // 想要保留换行信息
                // 则需要手动拼接换行
                // 大多数情况下 都不需要
                sb.append(line).append("\n");
                System.out.println("-->" + line);
            }
            String result = sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeAll(reader);
        }
    }
}
