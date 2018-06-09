package com.lanou3g.code0412.Inter;

/**
 * 使用 implements 关键字 来实现一个接口
 * 实现接口后 就会拥有接口中的所有的抽象方法
 * 那么  要么实现所有的抽象方法 要么把自己变成抽象类
 * 一般 都实现所有的抽象方法
 */
public class UDisk implements USB {
    private String data = "学习视频";

    @Override
    public String sendData() {
        return data;
    }

    @Override
    public void receiveData(String data) {
        this.data = data;
        System.out.println("现在U盘中的数据是:" + this.data);
    }

}
