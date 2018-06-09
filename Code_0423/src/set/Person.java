package set;

/**
 * Created by dllo on 18/4/23.
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            // instanceof 关键字:
            // 用来判断 左边的 对象  是否是 右边类型/右边类型的子类/实现了右边类型的接口
            // 如果  是 则 返回 true  不是 返回false
            return false;
        }
        // 之前的 代码 都是套路 永远这么写
        // 下面这两行 才根据自己的代码 进行判断
        Person other = (Person) obj;
        return this.name.equals(other.getName()) && this.age == other.getAge();

    }
        // 以后统一使用IDEA command+n
        // 选择equals()&hashcode()
        // 把要判断相等属性勾选上,然后点确定即可
        // 不需要自己手写
    @Override
    public int hashCode() {
        // 返回值的规则,行业标准,体现equals()里使用的属性即可
        // 怎么算 随便
        return name.hashCode() + age;
    }
}
