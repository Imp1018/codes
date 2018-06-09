package com.lanou3g.code0410.Counter;

import java.util.Scanner;

/**
 * 完成计算器v1.0
 * 1. 可以计算两位数的 + - * /
 * 2. 使用流程:
 * 2.1 先输入一个数  再输入一个数
 * 2.2 然后再输入操作符 + - * /
 * 2.3 打印出结果
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int b = scanner.nextInt();
        System.out.println("请输入操作符:");
        String op = scanner.next();


//        Operator operator = OperatorFactory.getOperator(op);
        int result=OperatorFactory.getOperator(op).compute(a,b);
//        int result = operator.compute(a, b);
        System.out.println("结果是:" + result);



    }



}
