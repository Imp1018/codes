package com.lanou3g.code0418.dirty;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by dllo on 18/4/17.
 */
public class Utils {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void updatePerson(Person person, String name, int age) {
        lock.writeLock().lock();
        person.setName(name);
        try {
            Thread.sleep(1000);   // 让线程沉睡一秒 为了让脏读效果更容易出现
        } catch (Exception e) {
            e.printStackTrace();
        }
        person.setAge(age);
        lock.writeLock().unlock();
    }


    public void showPerson(Person person) {
        lock.readLock().lock();
        System.out.println("姓名:" + person.getName());
        System.out.println("年龄:" + person.getAge());
        lock.readLock().unlock();
    }


}
