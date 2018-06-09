package com.lanou.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //最普通的bean注解
/*
 * @Controller web层
 * @Service service层
 * @Repository dao层
 */
//@Scope("prototype")
public class Car {
    @Autowired
    private Framework framework;

    //有参的构造方法
//    public Car(Framework framework) {
//        this.framework = framework;
//    }

    public Framework getFramework() {
        return framework;
    }

    public Car setFramework(Framework framework) {
        this.framework = framework;
        return this;
    }
}
