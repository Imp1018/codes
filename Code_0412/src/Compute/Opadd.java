package Compute;

/**
 * 一个类如果继承抽象类 那么只有两个选择
 //1.自己成为抽象类
 //2.覆写父类的抽象方法
 */
public class Opadd extends Operator{
    @Override
    public int compute(int num1, int num2) {
        return num1+num2;

    }

}
