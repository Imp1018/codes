package com.lanou3g.code0510.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dllo on 18/5/10.
 */
// 表示这个注解是在运行时生效
@Retention(RetentionPolicy.RUNTIME) //(元注解,专门修饰注解的注解)
@Target(ElementType.TYPE)  // 表示这个注解是修饰类的
public @interface MyAnno {
    String name();

    String path();

}
