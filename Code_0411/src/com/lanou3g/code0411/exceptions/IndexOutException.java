package com.lanou3g.code0411.exceptions;

/**
 * Created by dllo on 18/4/11.
 */
//索引越界异常
//当用户的索引 超出了范围时
//让程序停止运行 并给他明确的提示信息
//自定义异常:自己创造异常
public class IndexOutException extends RuntimeException {
    public IndexOutException(int max, int currentIndex) {
        super("索引超出了范围,最大值是0-" + max + ",你当前输入的是:" + currentIndex);
    }
}