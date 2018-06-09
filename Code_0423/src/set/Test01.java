package set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 18/4/23.
 */
public class Test01 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("张三");
        p1.setAge(18);

        Person p2=new Person();
        p2.setName("李四");
        p2.setAge(18);

        Person p3=new Person();
        p3.setName("张三");
        p3.setAge(18);

        Set<Person> people=new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (Person person : people) {
            System.out.println(person.getName() + person.getAge());
        }


    }
}
