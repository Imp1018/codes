package com.lanou3g.code0411;

import java.util.Objects;

/**
 * 在使用一个泛型类的时候
 * 在定义这个类时 需要在类名后使用<确定类型>
 * 来告诉泛型类 他定义的泛型究竟是什么类型的
 * 来对应我们的代码,即告诉Foo 他里面的T 究竟是什么类型的
 * 需要注意的是 在使用时需要填入确定的 已有的类型 而不能再次使用不确定的字母表示
 * 当定义完成后,这个对象中所有的泛型(即Foo中的T)都会被转换成
   确定的类型,所以 在方法中,参数/返回值类型就可以确定下来了

 泛型机制生效时间,是编译期,在运算时所有泛型都会被删除
 即,就是来帮助我们"写"代码的
 */
public class Test02 {
    public static void main(String[] args) {
        Foo<String> foo1 = new Foo<String>();
        foo1.setT("Hello");
        String a = foo1.getT();

        Foo<Person> foo2 = new Foo<Person>();
        foo2.setT(new Person());
        Person p = foo2.getT();

        Foo<Object> foo3 = new Foo<Object>();
        foo3.setT("World");
        foo3.setT(new Person());

     // 如果定义泛型类时 没有指定泛型
     // 则泛型会默认使用Object代替
        Foo foo4 = new Foo();
        foo4.setT("name");
        foo4.setT(new Person());
    }
}
