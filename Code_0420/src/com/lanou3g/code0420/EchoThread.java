package com.lanou3g.code0420;

import java.io.*;
import java.net.Socket;

/**
 * Created by dllo on 18/4/20.
 */
public class EchoThread extends Thread {
    private Socket client;

    public EchoThread(Socket client) {

        this.client = client;
    }

    @Override
    public void run() {
        BufferedReader reader = null;
        PrintWriter pw = null;
        try {
            OutputStream os = client.getOutputStream();
            InputStream is = client.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is));
            pw = new PrintWriter(new OutputStreamWriter(os));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String echo = "ECHO:" + line;
                pw.println(echo);
                pw.flush();
            }
        } catch (Exception e) {
            System.out.println("客户端异常断开");
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (client != null) {
                    try {
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
