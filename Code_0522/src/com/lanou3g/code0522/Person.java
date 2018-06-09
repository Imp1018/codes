package com.lanou3g.code0522;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;
import java.util.Map;

/**
 * javabean
 * 规定:
 * 1. 必须是一个public类(公有类)
 * 2. 必须有无参构造方法
 * 3. 所有属性必须私有
 * 4. 所有属性必须提供setter/getter方法来访问
 * (如果不希望这个属性 可读/可写,也可以根据情况
 * 不提供 对应的 setter/getter 方法)
 * 如果是Boolean类型的属性,那么他的get方法需要写成isxxx
 * 当一个类 满足了这些要求,我们就叫它javabean
 * 在日常开发中,当我们说Javabean的时候,除了满足上述
 * 4个要求 还有隐藏含义,就是这个类 没有什么实际复杂的逻辑
 * 就是和 数据库/页面 对应的 用来存数据的
 */


/**
 * HttpSessionBindingListener 这个接口 给对象一个能力
 * 可以知道 自己何时被放入到session对象中
 * 何时从session对象中被销毁
 */

/**
 * 要放到session中的javabean 必须实现Serializable接口
 * 否则 当session钝化的时候, session域对象中的javabean 就丢失了
 */
public class Person implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private boolean marry;
    private Map<String, String> jobs;

    public Map<String, String> getJobs() {
        return jobs;
    }

    public Person setJobs(Map<String, String> jobs) {
        this.jobs = jobs;
        return this;
    }

    public boolean isMarry() {
        return marry;
    }

    public Person setMarry(boolean marry) {
        this.marry = marry;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age - 8;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("我"+name+"被放入Session中");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("我"+name+"在Session中被销毁");
    }


    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("我跟session一起去硬盘了");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("我跟session一起回内存了");
    }
}
