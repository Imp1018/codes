/**
 * Created by dllo on 18/4/3.
 */
public class Teacher {
    float height;
    String subject;
       /*
       *   void 返回值 这个方法可以返回一些结果来给调用这个方法的地方
       *   如果写的是void 表示这个方法没有返回值
       *   teacher 方法名 自己随便起的 只要保证小驼峰结构就可以  注意:  不要使用拼音  方法名尽量是动词
       *   ():  参数列表 表示这个方法需要接收某些值 才能正常运行
       *   {}:  叫做方法体 里面是真正执行的代码
       * */

    void teach() {
        System.out.println("一个身高:" + height + "m" + subject + "老师在讲课");
    }
}
