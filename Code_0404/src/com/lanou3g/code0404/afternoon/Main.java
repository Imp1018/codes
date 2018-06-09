package com.lanou3g.code0404.afternoon;
// 一个类如果不直接在src文件夹下 则需要在
// 第一行 声明他所在的包


// 如果想要在当前包中使用其他包中的类
// 需要使用import关键字 导包
// import后跟着 要使用的类的 全限定类名(包名.类名)
// 没有意外 引包 和 声明包 不需要自己写
import com.lanou3g.code0404.morning.Table;

/**
 * 包命名规范:
 * 1. 只能由小写字母,下划线,数字组成,数字不能开头
 * 一般不使用下划线(小写字母永远不会和下划线同时出现)
 * 2. 一个项目会有一个"根包",这个根包通常是 公司域名的倒置
 * .项目名称
 */
public class Main {
    public static void main(String[] args) {
        Table table = new Table();
    }
}
