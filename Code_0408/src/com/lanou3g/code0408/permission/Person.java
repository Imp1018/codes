package com.lanou3g.code0408.permission;

/**
 *  权限修饰符 就是用来控制一个类中的属性或方法 是否能被其他类使用
 *  权限修饰符一共有四个:
 *  public  protected  default(啥也不写)  private
 *
 *  在java中 能否访问其他类的属性或方法 分成了一下几种情况
 *  1. 自己能否访问
 *  2. 同一个包下的其他类能否访问
 *  3. 子类能否访问(子类学继承的时候会说)
 *  4. 任何类能否访问
 *                       用的少
 *            public   protected    default(不写)   private
 *    任何类     √         X             X             X
 *    子类       √         √             X             X
 *    同包       √         √             √             X
 *    自己       √         √             √             √
 *
 */
public class Person {
     String name;
    public int age;
    private String gender;
    //  改变性别
    public void changeGender(){
        /*
        *  1. private 权限的属性只能够在当前类中被访问
        *    即 只能在当前类中 写代码来 对该属性进行值的修改 或者读取他的值
        *
          *  由于 java中想要访问一个对象的属性/方法
          *  需要使用的语法是 对象.属性/ 对象.方法
          *  而在person这个类中 我们想要改变 gender属性的值 又没有办法拿到这个类的对象
          *  所以 java 创造了一个关键字 this
          *  this 永远指: 本类对象 就是这个类 new出来的对象
          *  但是 具体指哪个对象 并不确定 哪个对象调用了该方法 this就指这个对象
          *     即: this指 调用该方法的对象
          *    总结: 1. this 指 本类对象
          *         2. this 指 调用该方法的对象
        * */
        this.gender="男";
    }
}
