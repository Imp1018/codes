package com.lanou.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAopDemo {

    public void around(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("方法开始......");
        // 加载连接点
        pjp.proceed();

        System.out.println("方法结束......");
    }

    public void before() {
        System.out.println("前置增强&&&&");
    }
}
