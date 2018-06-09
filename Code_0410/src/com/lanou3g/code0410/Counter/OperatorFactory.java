package com.lanou3g.code0410.Counter;

/**
 * Created by dllo on 18/4/10.
 */
public class OperatorFactory {
    //根据操作符加减乘除 来生成指定的计算类
    //  工厂模式    //返回值   //方法名    //参数列表
    public static Operator getOperator(String op) {
        Operator operator = null;
        switch (op) {
            case "+":
                operator = new OpAdd();
                break;
            case "-":
                operator = new OpSub();
                break;
            case "*":
                operator = new OpMultiply();
                break;
            case "/":
                operator = new OpDivide();
                break;
        }
        return operator;
    }
}
