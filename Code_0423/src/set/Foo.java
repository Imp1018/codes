package set;

/**
 * Created by dllo on 18/4/23.
 */
public class Foo {
    {
        // 在类中 直接用大括号括起来的代码 叫做构造代码块
        // 它会在构造方法之前执行
        // 并且 创建一次对象 执行一次
        // 只在 new对象的时候会执行
        System.out.println("这叫构造代码块");
    }

    public Foo() {
        System.out.println("这叫构造方法");
    }
}
