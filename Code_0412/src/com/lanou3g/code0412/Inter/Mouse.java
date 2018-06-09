package com.lanou3g.code0412.Inter;

/**
 * Created by dllo on 18/4/12.
 */
public class Mouse implements USB {

    @Override
    public String sendData() {
        return "点击了左键";
    }

    @Override
    public void receiveData(String data) {

    }
}
