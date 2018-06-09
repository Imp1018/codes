package com.lanou3g.code0412.Inter;

import java.util.ArrayList;

/**
 * Created by dllo on 18/4/12.
 */
public class Computer {
    /*
    * 接口 可以当做一个数据类型来定义变量
    * 就好像一个类一样
    * 我们心里清晰的知道 使用的这个对象 一定是接口的实现类
    * 因为接口中只有抽象方法 是不可能New 出来的
    * 即 类似于 USB usb = new UDisk(); 这样的代码
    * 就好像 USB是UDisk()的 父类一样去使用
    * 即 我们可以用接口类型 指向 实际的对象 也可以叫做父类引用指向子类对象(虽然他们没有父子关系)
    * */
    private USB usb;

    private ArrayList<String> datas = new ArrayList<>();

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void getDataFromUSB() {
        String data = usb.sendData();
        this.datas.add(data);
    }

    public void showDatas() {
        for (String data : datas) {
            System.out.println(data);
        }
    }
}