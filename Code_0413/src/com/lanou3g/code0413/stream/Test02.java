package com.lanou3g.code0413.stream;

/**
 * Created by dllo on 18/4/13.
 */
public class Test02 {
    public static void main(String[] args) {

    }

    public static int fun() {
        int a = 3;
        try {
            a = 4;
        } catch (Exception e) {
            a = 5;
        } finally {
            // finally 可以保证无论什么情况
            // 里面的代码一定会被执行
            // 通常就是用来释放资源(关流)
            // finally里面没有return 那就返回try里面的值
            a = 6;
        }
        return a;
    }
}
