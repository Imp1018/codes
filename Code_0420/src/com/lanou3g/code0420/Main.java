package com.lanou3g.code0420;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by dllo on 18/4/20.
 */
public class Main {
    public static void main(String[] args) {
        //  TCP 客户端
        //  使用无参的构造方法
        //  这个socket对象会自动绑定本地的一个没有被使用的端口号
        Socket socket = new Socket();
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = null;

        try {
            //让socket客户端连接到远程服务器
            //需要指定服务器的IP地址和端口号          //localhost
            socket.connect(new InetSocketAddress("127.0.0.1", 2333));

            new ReadThread(socket).start(); // 开启线程来读数据

            OutputStream os = socket.getOutputStream();
            pw = new PrintWriter(new OutputStreamWriter(os));

            while (true) {
                String line = scanner.nextLine();   // 接收控制台的输入
                pw.println(line);
                pw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
            // socket对象使用完之后 也需要关闭
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();    // scanner 使用完成后 也需要关闭
        }
    }


}
