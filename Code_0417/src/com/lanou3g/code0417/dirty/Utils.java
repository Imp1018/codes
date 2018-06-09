package com.lanou3g.code0417.dirty;

/**
 * Created by dllo on 18/4/17.
 */
public class Utils {
    private final Object lock = new Object();

    public void updatePerson(Person person, String name, int age) {
        synchronized (lock) {
            person.setName(name);
            try {
                Thread.sleep(1000);   // 让线程沉睡一秒 为了让脏读效果更容易出现
            } catch (Exception e) {
                e.printStackTrace();
            }
            person.setAge(age);
        }
    }

    public void showPerson(Person person) {
        synchronized (lock) {
            System.out.println("姓名:" + person.getName());
            System.out.println("年龄:" + person.getAge());
        }

    }

}
