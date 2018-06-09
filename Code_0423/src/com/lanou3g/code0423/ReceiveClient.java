package com.lanou3g.code0423;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by dllo on 18/4/23.
 */
public class ReceiveClient {
    public static void main(String[] args) {
        try {
            // UDP 协议使用DatagramSocket
            // ds对象 可以用来接收/发送数据
            // 准备接收数据的时候 需要在构造方法中
            // 指定一个固定端口号
            // 如果没有指定端口号 那么会随机绑定一个端口号上
            // 这时 发送方 就会不知道向哪个端口发送数据
            DatagramSocket ds = new DatagramSocket(7788);
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            try {
                ds.receive(packet);
                String data = new String(packet.getData(), 0, packet.getLength());
                System.out.println(data);

                byte[] s = "我收到了".getBytes();
                //  发送方的地址
                System.out.println(packet.getAddress());
                System.out.println(packet.getPort());
                DatagramPacket re = new DatagramPacket(s, s.length, packet.getAddress(), packet.getPort());
                ds.send(re);  // 发送数据给发送方

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
