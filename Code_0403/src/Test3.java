/**
 * Created by dllo on 18/4/3.
 */
public class Test3 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        int num = 3;
        // 调用方法时
        // 如果想要传递参数 需要满足以下条件
        //  1. 参数的类型和该方法需要的类型相同
        //  2. 参数的个数 需要和该方法需要的个数相同
        //  即 真正给方法的参数 要和方法需要的参数 一一对应

        // 参数的传递 本质上传递的是 第三个格子里的内容
        foo.fun(num);
    }
}
