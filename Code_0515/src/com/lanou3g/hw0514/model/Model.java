package com.lanou3g.hw0514.model;

import com.lanou3g.hw0514.pojo.User;
import com.lanou3g.hw0514.util.JDBCUtil;
import com.lanou3g.hw0514.util.MyResultSet;
import com.lanou3g.hw0514.util.MyStatement;
import com.lanou3g.hw0514.pojo.User;
import com.lanou3g.hw0514.util.JDBCUtil;
import com.lanou3g.hw0514.util.MyResultSet;
import com.lanou3g.hw0514.util.MyStatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * If there are no bugs, it was created by Chen FengYao on 2018/4/27;
 * Otherwise, I don't know who created it either
 */

/*
专门与数据库进行连接
*/
public class Model {

    /**
     * 判断数据库中 是否有某一个用户名
     *
     * @param username 要判断的 用户名
     * @return true: 数据库中有该用户; false: 数据库中没有该用户
     */
    public boolean hasUsername(String username) {
        // Statement statement = JDBCUtil.getStatement();
        // 判断有没有这个用户,其实就是查找
        // 数据库中 有该用户名的 数据条数
        // 条数为0  没有
        // >0 有
        // 拼接sql语句的时候 不要忘记单引号
//        String sql =
//                "SELECT COUNT(*) FROM USERS WHERE username = '"
//                        + username + "'";
//        try {
//            ResultSet rs = statement.executeQuery(sql);
//            rs.next();//移动到第一条数据
//            // 数量信息 肯定是第一列,所有 直接写1
//            int count = rs.getInt(1);
//            if (count > 0) {
//                return true; // 数据库中 有该用户名
//            }
//            rs.close();// 关闭资源
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;


        String sql = "SELECT COUNT(*) FROM users WHERE username = ?";
        MyStatement statement = JDBCUtil.getPreStatement(sql);
        statement.setString(1, username);
        // 这行语句执行完成后,不会自动关闭资源
        MyResultSet rs = statement.executeQuery();

        rs.next(); //索引移动到第一行
        int count = rs.getInt(1);
        rs.close();
        JDBCUtil.closeResource(statement);
        return count > 0;

    }


    /**
     * 注册
     *
     * @param username 用户名
     * @param pwd      密码
     * @param word     喜欢的一句话
     * @return true: 注册成功; false 注册失败
     */
    public boolean register(String username,
                            String pwd,
                            String word) {
        String sql = "INSERT INTO users (username , pwd , word) " +
                "VALUES ( ? , ? , ? )";
        MyStatement statement = JDBCUtil.getPreStatement(sql);
        statement.setString(1, username);
        statement.setString(2, pwd);
        statement.setString(3, word);
        // 不需要结果集的 执行,可以实现自动关闭资源
        int rows = statement.executeUpdate();
        return rows > 0;


//        String sql = "INSERT INTO users (username, psd, word)" +
//                " VALUES (" +
//                "'" + username + "'," +
//                "'" + psd + "'," +
//                "'" + word + "')";
//        Statement statement = JDBCUtil.getStatement();
//        try {
//            int rows = statement.executeUpdate(sql);
//            if (rows > 0) {
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
    }


    /**
     * 登录
     *
     * @param username 用户名
     * @param pwd      密码
     * @return 登录成功: 返回装着用户信息的User对象
     * 登录失败: return null
     */
    public User login(String username, String pwd) {
        // 1. 查一下 是否有 这个用户
        // 条件是 用户名,和密码 都匹配上

        String checkLogin = "SELECT * FROM users WHERE " +
                "username = ? AND pwd = ?";
        PreparedStatement statement =
                JDBCUtil.getPreStatement(checkLogin);
        try {
            // 设置值
            statement.setString(1, username);
            statement.setString(2, pwd);

            ResultSet rs = statement.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                String dbUsername = rs
                        .getString("username");
                String dbPwd = rs
                        .getString("pwd");
                String dbWord = rs
                        .getString("word");
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

    public static void main(String[] args) {
        String username = "aaa' OR 1 = 1 --  ";
        String pwd = "asdfasfa";

        Model model = new Model();
        User user = model.login(username, pwd);
        if (user == null) {
            System.out.println("用户名/密码错误");
        } else {
            System.out.println(user.getWord());
        }
    }

}
