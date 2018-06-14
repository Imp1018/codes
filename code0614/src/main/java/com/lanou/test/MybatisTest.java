package com.lanou.test;

import com.lanou.entity.Item;
import com.lanou.entity.Order;
import com.lanou.mapper.ItemMapper;
import com.lanou.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ItemMapper mapper = sqlSession.getMapper(ItemMapper.class);
        Item item = new Item();
        item.setName("手机");
        item.setPrice(3000.0);

        List<Item> items = mapper.findItem(item);
        System.out.println(items);
    }

    @Test
    public void test1() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ItemMapper mapper = sqlSession.getMapper(ItemMapper.class);
        List<Integer> ids = new ArrayList<>();
//        ids.add(6);
//        ids.add(7);
//        ids.add(8);
//        ids.add(9);
        //  mapper.deleteByIds(null);
        mapper.deleteByIdArray(new Integer[]{1, 2, 3});
        //  sqlSession.commit();
        System.out.println(ids);


    }


    @Test
    public void test2() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.findOrderWithUserById(2);
        System.out.println(order);
    }


    @Test
    public void test3() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.findOrderWithOrderDetailsById(2);
        System.out.println(order);
    }



}