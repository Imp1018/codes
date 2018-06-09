/**
 * Created by dllo on 18/4/3.
 */
public class Test2 {
    public static void main(String[] args) {
        Student student = new Student();


        // 对象.方法
        // 调用student 对象的 study()方法
        student.name = "张三";
        student.study();    // 方法的调用

        Student student1 = new Student();
        student.name = "隔壁老王";
        student.study();

    }
}
