package com.lanou3g.code0423;

/**
 * Created by dllo on 18/4/23.
 */
public class Main {
    public static void main(String[] args) {
        String a="我";    //unicode(字符集)->utf8  utf->16  编码
        byte[] bytes=a.getBytes();
        for (byte aByte : bytes) {
            // 16 进制 0 1 2 3 4 5 6 7 8 9 A B C D E F
            // 2进制的4位
            // 1个字节 2进制8位 -> 2个16进制的数
            System.out.println(Integer.toHexString(aByte));
        }
    }
}
