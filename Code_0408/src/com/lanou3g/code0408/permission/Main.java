package com.lanou3g.code0408.permission;

/**
 * Created by dllo on 18/4/8.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张三";
        person.age = 19;
        //   person.gender="男";       不能使用gender
        Woman w1 = new Woman();
        w1.name = "斯嘉丽约翰逊";
        for (int i = 0; i < 34; i++) {
            w1.birthday();
        }
        w1.doSth = "拍电影";
        Woman w2 = new Woman();
        w2.name = "迪丽热巴";
        for (int i = 0; i < 25; i++) {
            w2.birthday();
        }
        w2.doSth = "烤串";
       Foo foo=new Foo();
        foo.fun();

        w1.showSelf();
        w2.showSelf();

    }
}
