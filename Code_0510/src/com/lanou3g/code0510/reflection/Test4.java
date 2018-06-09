package com.lanou3g.code0510.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by dllo on 18/5/10.
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person());
// personList.add("String");
//         反射第一步 获取类类型
        Class Clazz = personList.getClass();
        // 通过反射 获取一个类中的方法
        // 第一个参数 表示 方法名
        // 后面的所有参数,需要传递 你要获取的方法的参数类型
        Method method = Clazz.getDeclaredMethod("add", Object.class);
        // 如果是public方法,这行代码可以省略, 否则 需要加上
        method.setAccessible(true);

        method.invoke(personList, "String");
//        System.out.println(personList.size());

        // 通过反射 成功将String类型的数据 放入了Person泛型的list中
        // 证明 泛型只在编译期生效, 在程序运行时期 会统一擦除成Object
        Object s = personList.get(1);
        System.out.println(s);
    }
}
