package com.lanou3g.code0427.study;

import com.lanou3g.code0427.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dllo on 18/4/27.
 */
public class SQLTest {
    //防止 SQL 注入
    public static void main(String[] args) {
        Connection conn= JDBCUtil.getConn();
        String sql="select * from users " +"WHERE username=?AND pwd=?";

        try {
            //为了防止sql注入
            //要使用Statement的子类
            //PreparedStatement
            //它在使用的时候 sql不需要拼接字符串
            //而是使用?作为变量的占位符
            //之后 调用setXX的方法 去为每个占位符设置内容
            PreparedStatement ps=conn.prepareStatement(sql);
            //1 代表sql语句中的第一个?
            //"AA" 代表这个? 对应的值
            ps.setString(1,"Aa");
            ps.setString(2,"123456");
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                String word=rs.getString("word");
                System.out.println(word);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
