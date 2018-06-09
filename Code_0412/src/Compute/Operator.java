package Compute;
/**
 *  可以在class 前 加 abstract 关键字 把一个类变成抽象类
 *  只有抽象类中 才能存在抽象方法
 *  而 抽象类中 不一定存在抽象方法
 *  一个类如果是抽象类 那么 这个类是没有办法 new 出对象的 必须使用它的子类
 */
public abstract class  Operator {
    /*
    *
    *  抽象方法:
    *  定义: 没有方法体的方法叫做抽象方法
    *  抽象方法需要在返回值 类型前 加abstract关键字
    * */
    public abstract int compute(int num1, int num2);


    // 抽象类中 可以存在普通方法
    public void fun(){

    }
}