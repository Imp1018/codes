/**
 * Created by dllo on 18/4/3.
 */
public class Main {
    public static void main(String[] args) {
        // 创建一个学生对象  赋值给a
        Student a = new Student();
        // 对 a 这个对象的 年龄 和 姓名 进行赋值
        // 点 . 就把他理解为 "的"
        // 只能是 对象.
        a.age = 18;
        a.name = "张三";     // "" 这个东西就是String
        // 不是基本数据类型,但是比较常用
        //  所以 特殊记忆
        Student b = new Student();
        b.age = 19;
        b.name = "李四";
        System.out.println(a.name);
        System.out.println(b.name);
        a.name = "赵四";
        System.out.println(a.name);


    }
}
