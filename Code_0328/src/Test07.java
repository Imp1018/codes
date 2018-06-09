/**
 * Created by dllo on 18/3/28.
 */
public class Test07 {
    public static void main(String[] args) {
        //输入用户的年龄
        //如果 18以下; 输出 小孩

        int age = 19;
        //if(){}
        //小括号内的条件成立,则执行大括号内的代码
        //boolean  布尔,只有两种取值: true/false
        //if的小括号里 表达式再复杂,最后也可计算出 true/false

        //逻辑运算:
        //  >  <  =  !=  >=  <=  优先级比 + - * / 要低,后计算
        boolean a = 3 > 5;  // false   大于
        boolean b = 3 < 5;  //true     小于
        boolean c = 6 == 7; //false    等于
        boolean d = 7 != 8; //true     不等于

        //如果年龄 在0-120之间,是正确的
        // 0 < age < 120
        // 逻辑运算符:
        // && || ! (与/或/非)

        // &&;(只能计算boolean类型的值,其他计算不了)
        // 左右两边填写两个boolean类型的值
        // 都为true 则 最后结果为true
        // 只要有一个为false,最后结果为false
        // 一假即假
        boolean e = true && true;     //true
        boolean f = false && true;    //false

        // ||  或
        // 左右两边填写两个boolean类型的值
        // 只要有一个为true,则结果为true
        // 都为false,则结果为false
        // 一真即真
        boolean g = true || false;    //true
        boolean h = false || false;   //false

        // !  非
        // 对紧跟着的boolean值进行取反
        boolean i = !false;  //ture
        boolean j = !true;  //false
        boolean k = age > 0 && age < 120;   // 0<age<120

        if (age < 18) {
            System.out.println("小孩");
        }

    }
}
