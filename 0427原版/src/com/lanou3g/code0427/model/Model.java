package com.lanou3g.code0427.model;

import com.lanou3g.code0427.pojo.User;
import com.lanou3g.code0427.util.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dllo on 18/4/27.
 */
/*
专门与数据库进行连接

 */
public class Model {
    /**
     * 注册
     *
     * @param username 用户名
     * @param pwd      密码
     * @param word     喜欢的一句话
     * @return true:注册成功  false:失败
     */
    public boolean register(String username, String pwd, String word) {
        String sql = "INSERT into users(username,pwd,word) VALUES (?,?,?)";
        //Statement statement = JDBCUtil.getStatement();
        PreparedStatement statement=JDBCUtil.getPreStatement(sql);
        try {
            statement.setString(1, username);
            statement.setString(2, pwd);
            statement.setString(3, word);
            int rows = statement.executeUpdate();
            if (rows > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 判断数据库中是否有某一个用户名
     *
     * @param username 要判断的用户名
     * @return true:数据库中有该用户  false:数据库中没有该用户
     */
    public boolean hasUsername(String username) {
//        Statement statement = JDBCUtil.getStatement();
        //判断有没有这个用户 就是查找数据库中该用户
        // 有该用户名的数据条数 条数为0没有
        // >0有
        String sql = "select count(*) from users where username = ?";
        PreparedStatement statement = JDBCUtil.getPreStatement(sql);
        try {
            statement.setString(1,username);
            ResultSet rs = statement.executeQuery();
            rs.next();//移动到第一条数据
            //数量信息肯定是第一列,所以 直接写1
            int count = rs.getInt(1);
            if (count > 0) {
                return true;//数据库中有该用户名
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

//    public static void main(String[] args) {
//        Model model = new Model();
//
//        boolean hasUsername = model.hasUsername("Aa");
//        System.out.println(hasUsername);
//    }

    /**
     * 登录
     *
     * @param username
     * @param pwd
     * @return 登录成功:返回装着用户信息的User对象
     * 登录失败:return null
     */
    public User login(String username, String pwd) {
        //1.查一下 是否有这个用户 条件是用户名和密码都匹配上
        String checkLogin = "SELECT * FROM users WHERE username = ? AND pwd = ?";
        PreparedStatement statement = JDBCUtil.getPreStatement(checkLogin);
        try {
            //设置值
            statement.setString(1, username);
            statement.setString(2, pwd);
            ResultSet rs = statement.executeQuery();

            User user = null;

            if (rs.next()) {
                user = new User();
                String dbUsername = rs.getString("username");
                String dbPwd = rs.getString("pwd");
                String dbWord = rs.getString("word");
                user.setUsername(dbUsername);
                user.setPwd(dbPwd);
                user.setWord(dbWord);
            }
            rs.close();
            JDBCUtil.closeResource(statement);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

}