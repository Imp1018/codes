package com.lanou3g.code0522.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 如果在同一个项目中 注册了同一个类型的listener
 * 那么方法回调的顺序:
 * 1. 如果在web.xml中注册,那么按照注册顺序回调
 * 2. 如果使用注解注册,那么按照类名(包名.类名)字母排序的顺序回调
 * 3. 如果一个在web.xml中,一个用注解
 * web.xml永远会优先于注解
 */
public class ThirdListener implements HttpSessionAttributeListener{
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("ThirdListener");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {

    }
}
