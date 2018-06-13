package com.lanou.test;

import com.lanou.entity.Person;
import com.lanou.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        // 通过全局配置文件 创建SQLSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
    }


    @Test
    public void test1() throws IOException {
//        // 加载全局配置文件
//        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
//        // 通过全局配置文件 创建SQLSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
//        // 通过上面获取sqlSession SQLSession类似于JDBC中的Conn
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 通过SQLSession执行SQL语句,通过namespace.ID 在映射文件中找到对应的SQL
        List<Person> persons = sqlSession.selectList("person.findAll");
        for (Person person : persons) {
            System.out.println(person);
        }


        //  设置主键返回
//        Person person=new Person();
//        person.setName("asdf");
//        person.setAge(15);
//        sqlSession.insert("person.insert",person);
//        person.getId();

    }

    @Test
    public void test2() throws IOException {
//        // 加载全局配置文件
//        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
//        // 通过全局配置文件 创建SQLSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
//        // 通过上面获取sqlSession SQLSession类似于JDBC中的Conn
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person = sqlSession.selectOne("person.findById", 2);
        System.out.println(person);


    }

    @Test

    public void test3() throws IOException {
//        // 加载全局配置文件
//        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
//        // 通过全局配置文件 创建SQLSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
//        // 通过上面获取sqlSession SQLSession类似于JDBC中的Conn
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person = new Person();
        person.setName("asdf");
        person.setAge(15);
        int i = sqlSession.insert("person.insert", person);
        sqlSession.commit();
        System.out.println(person);

    }

    @Test
    public void test4() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);

        List<Person> persons = mapper.findAll();

        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println(mapper.getClass());
    }

    @Test
    public void test5() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);

        Person person = new Person();
        person.setAge(24);
        person.setName("poi");

        mapper.insert(person);

        sqlSession.commit();
    }

@Test
    public void test6() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);

        List<Person> persons = mapper.findByNameLike("%as%");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}