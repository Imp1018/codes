package com.lanou3g.code0420;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by dllo on 18/4/20.
 */
public class Server {
    //并发ECHO服务器
    //是一种常见的小型服务器
    //作用 将客户端发送来的数据 原封不动的
    //再发回给客户端
    //这样 客户端可以方便的判断服务器是否好用
    public static void main(String[] args) {
        try {
            //创建一个Socket服务器对象
            //在创建的时候绑定客户端口号
            //注意 如果你重复运行该代码
            //会出现端口号被占用异常
            ServerSocket ss = new ServerSocket(2333);

            //accept()方法是socket服务器等待
            //客户端的介入,如果没有客户端接入
            //则代码会在这一行一直等下去
            System.out.println("服务器已启动 等待连接");
            while (true) {
                Socket client = ss.accept();
                System.out.println("有一个客户端接入:"+client.getRemoteSocketAddress());//获得IP 和 端口号
//            OutputStream os = client.getOutputStream();
//            InputStream is = client.getInputStream();
//
//            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
//            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//            while (client.isClosed()) {
//                //只要客户端没有断开连接
//                String line = "";
//                while ((line = reader.readLine()) != null) {
//                    String echo = "ECHO:" + line;
//                    pw.write(echo);
//                    pw.flush();
//                }
//            }


                //为每一个客户端创建线程
                new EchoThread(client).start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}