package com.lanou3g.code0427.model;

import com.lanou3g.code0427.Util.JdbcUtil;
import com.lanou3g.code0427.Util.MyResultSet;
import com.lanou3g.code0427.Util.MyStatement;
import com.lanou3g.code0427.pojo.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 专门与数据库进行连接
 */
public class Model {
    /**
     * 注册
     *
     * @param username 用户名
     * @param pwd      密码
     * @param word     喜欢的一句话
     * @return true 注册成功   false 注册失败
     */
    public boolean register(String username, String pwd, String word) {
        String checkRegister = "INSERT INTO client (username, pwd, word)VALUES(?,?,?)";


//        Statement statement = JdbcUtil.getStatement();
        PreparedStatement statement = JdbcUtil.getPreStatement(checkRegister);
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
     * 判断数据库中 是否有某一个用户名
     *
     * @param Username 要判断的用户名
     * @return true:  数据库中有该用户   false: 数据库中没有该用户
     */
    public boolean hasUsername(String Username) {
////        Statement statement = JdbcUtil.getStatement();
//
//        // 判断有没有这个用户其实就是查找数据库中 有该用户名的数据条数
//        // 条数为0 没有  大于0 有
//
//        // 拼接SQL语句的时候不要忘了单引号
//        String CheckHasUsername = "select count(*) from client where username =? ";
//        PreparedStatement statement = JdbcUtil.getPreStatement(CheckHasUsername);
//        try {
//            statement.setString(1, Username);
//            ResultSet rs = statement.executeQuery();
//            rs.next();  //移动到第一条数据
//            // 数量信息 肯定是第一列 所以 直接写 1
//            int count = rs.getInt(1);
//            if (count > 0) {
//                return true;
//            }
//            rs.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
        String sql="SELECT COUNT(*) FROM client WHERE username=?";
        MyStatement statement=JdbcUtil.getPreStatement(sql);
        statement.setString(1,Username);
       // 执行完这行语句后 资源会自动关闭
        MyResultSet rs=statement.executeQuery();
        rs.next();
        int  count=rs.getInt(1);
        rs.close();
        return count>0;

    }

//    public static void main(String[] args) {
//        Model model=new Model();
//        boolean hasUsername=model.hasUsername("Aa");
//        System.out.println(hasUsername);
//    }


    /**
     * @param username 用户名
     * @param pwd      密码
     * @return 登录成功 返回装着用户信息的user对象
     * 登录失败 return null
     */
    public User login(String username, String pwd) {
        // 1. 查一下 是否有这个用户
        // 条件是 用户名,密码都匹配上
        String checkLogin = "select * from client WHERE username= ? AND pwd= ?";

        PreparedStatement statement = JdbcUtil.getPreStatement(checkLogin);
        // 设置值

        try {
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
            JdbcUtil.closeResource(statement);
            return user;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
