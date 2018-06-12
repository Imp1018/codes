package com.lanou.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnoAopDemo {
    @Pointcut("execution(* com.lanou.service.*.*(..))")
    public void pt() {


    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前++++++++");
        pjp.proceed();
        System.out.println("环绕后++++++++++++");
    }
}
