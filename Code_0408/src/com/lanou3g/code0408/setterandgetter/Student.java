package com.lanou3g.code0408.setterandgetter;

/**
 * set/get 方法
 * 并不是语法要求 只是java这个行业的通用写法
 */
public class Student {
    private int score;    //分数

    // 有的时候 我们不希望直接将对象的属性值暴露出去
    // 就可以:
    // 1. 将这个属性改成private
    // 2. 写一个方法来获取这个属性
    public int getScore() {
        if (score >= 60) {
            return score;
        } else {
            return score + 10;
        }
    }

    //   当需要对对象的属性进行设置时 添加校验的功能 步骤:
    //   1.将该属性设置为private
    //   2.使用方法来校验并为该属性赋值
    public void setScore(int score) {
        if (score > 100 || score < 0) {
            System.out.println("分数设置错误");
        } else {
            this.score = score;
        }
    }
}
