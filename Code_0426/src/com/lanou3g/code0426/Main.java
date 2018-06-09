package com.lanou3g.code0426;

import java.sql.*;

/**
 * Created by dllo on 18/4/26.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * jdbc 一共有4个核心类
         * 1. DriverManager
         *    用来管理驱动的
         * 2. Connection
         * 3. Statement
         * 4. ResultSet
         */
        try {
            // 1. 装载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获得连接
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lan_ou", "root", "123456");
            // 3.获得执行SQL语句的对象
            Statement state = conn.createStatement();
            // 4.执行SQL语句
            String sql = "select * from stu";
            // 用来执行没有结果的sql
            // 返回值 int 用来表示 这条SQL 影响了多少行数据
            //        int row=state.executeUpdate(sql);
            ResultSet resultSet = state.executeQuery(sql);


            while (resultSet.next()) {
                String name = resultSet.getString("sid");
                String id = resultSet.getString("sname");
                String gender = resultSet.getString("gender");
                int age = resultSet.getInt("age");
//                System.out.println(resultSet.getObject("sid"));
//                System.out.println(resultSet.getObject("sname"));
//                System.out.println(resultSet.getObject("age"));
//                System.out.println(resultSet.getObject("gender"));
            }
            // 5. 关闭资源
            state.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
