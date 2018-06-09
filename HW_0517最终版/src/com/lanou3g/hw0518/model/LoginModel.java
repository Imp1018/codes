package com.lanou3g.hw0518.model;

import com.lanou3g.hw0518.pojo.User;
import com.lanou3g.hw0518.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginModel {
    public List<User> getUsers(String username) {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM user WHERE username like ?";
        Connection conn = JDBCUtil.getConn();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + username + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                //设置每一个用户的属性
                setUserParam(user, rs);
                //把这个用户加入到集合中
                users.add(user);
            }
            rs.close();
            statement.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    public User login(String username, String password) {

        if (username == null || password == null) {
            return null;
        }
        try {
            User user = new User();
            Connection conn = JDBCUtil.getConn();
            String sql = "select * from user where username=? and pwd=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            rs.next();
            setUserParam(user, rs);

            rs.close();
            statement.close();


            return user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void setUserParam(User user, ResultSet rs) throws SQLException {
        String username = rs.getString("username");
        //设置User属性
        String gender = rs.getString("gender");
        String nickname = rs.getString("nickname");
        int id = rs.getInt("uid");
        List<String> hobbies = getHobbies(id);
        user.setUsername(username).setGender(gender)
                .setNickname(nickname).setHobbies(hobbies)
                .setPassword("");
    }

    private List<String> getHobbies(int id) {
        List<String> hobbies = new ArrayList<>();
        String sql = "SELECT opt FROM user_hobby,hobby " +
                "WHERE uid = ? AND user_hobby.hid = hobby.hid";
        Connection conn = JDBCUtil.getConn();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String hobby = rs.getString(1);
                hobbies.add(hobby);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return hobbies;

    }

    //能否登录成功
    public boolean canLogin(String username, String pwd) {
        Connection conn = JDBCUtil.getConn();
        String sql = "select count(*) from user where username = ? and pwd=?";


        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, pwd);
            ResultSet rs = statement.executeQuery();
            boolean canLogin = false;
            if (rs.next()) {
                int count = rs.getInt(1);
                canLogin = count > 0;
            }
            statement.close();
            rs.close();


            return canLogin;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
