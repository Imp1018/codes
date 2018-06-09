package com.lanou3g.code0417.dirty;

/**
 * Created by dllo on 18/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        Utils utils = new Utils();
        // 内部类中要使用外部定义的局部变量
        // 该局部变量需要时final类型
        new Thread() {
            @Override
            public void run() {
                utils.updatePerson(person, "李四", 19);
            }
        }.start();

        //  为了演示脏读 让线程停止500ms
        //  保证修改了用户名 还没来得及修改年龄
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                utils.showPerson(person);
            }
        }).start();

    }
}
