package com.lanou3g.code0423;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * Created by dllo on 18/4/23.
 */
public class SendClient {
    public static void main(String[] args) {
        try {
            // 暂时不需要接收数据 所以随机绑定一个端口号即可
            DatagramSocket ds = new DatagramSocket();
            String s = "HelloWorld";
            byte[] buf = s.getBytes();//获取字节数组
            // 要发送到的目的地 地址 端口号
            DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 7788));
            ds.send(dp);  // 发送

            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            ds.receive(packet);  //等着接收数据
            String data = new String(packet.getData(), 0, packet.getLength());
            System.out.println(data);   // 显示数据

            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
