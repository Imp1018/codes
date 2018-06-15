package com.lanou.test;

import com.lanou.entity.Order;
import com.lanou.entity.User;
import com.lanou.mapper.OrderMapper;
import com.lanou.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {


    @Test
    public void test1() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.findById(1);
        System.out.println(order.getCreateTime());

        System.out.println(order.getUser().getUsername());
    }


    @Test
    public void test2() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user1 = userMapper.findById(1);
        user1.setGender(1);
        userMapper.update(user1);
        sqlSession.commit();

        User user2 = userMapper.findById(1);
        System.out.println(user1.getUsername());
        System.out.println(user2.getUsername());
        sqlSession.close();//连接归还

    }

    @Test
    public void test3() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession1 = sessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = userMapper1.findById(1);

        System.out.println(user1.getUsername());

        sqlSession1.close();//连接归还


        SqlSession sqlSession2 = sessionFactory.openSession();

        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = userMapper2.findById(1);

        System.out.println(user2.getUsername());

        sqlSession1.close();//连接归还

    }

    @Test
    public void test4() {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = userMapper.findById(1);
        System.out.println(user.getUsername());


    }


}