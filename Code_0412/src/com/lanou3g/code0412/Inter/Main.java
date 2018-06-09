package com.lanou3g.code0412.Inter;

/**
 * Created by dllo on 18/4/12.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        UDisk uDisk = new UDisk();
        Mouse mouse = new Mouse();
//
//        computer.setUsb(uDisk);
//
//        computer.getDataFromUSB();

        computer.showDatas();

        computer.setUsb(mouse);
        computer.getDataFromUSB();
    }
}
