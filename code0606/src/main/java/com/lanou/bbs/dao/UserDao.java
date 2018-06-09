package com.lanou.bbs.dao;

import com.lanou.bbs.entity.User;
import com.lanou.bbs.util.JDBCUtils;
import com.lanou.bbs.util.JDBCUtils;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class UserDao {
    public User findByUsername(String username) throws SQLException {
        Connection conn = JDBCUtils.getConnection();
        String sql = "select * from user where name = ? ";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            User user = new User();
            user.setUid(rs.getInt("uid"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));
            user.setGender(rs.getString("gender"));
            user.setRegDate(rs.getDate("regDate"));
            user.setState(rs.getInt("state"));
            rs.close();
            conn.close();
            return user;

        } else {
            conn.close();
            return null;
        }
    }

    public void add(User user) throws SQLException {
        Connection conn =JDBCUtils.getConnection();
        String sql = "INSERT into user(name,password,nickname,gender,state) VALUES (?,?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, user.getName());
        statement.setString(2, user.getPassword());
        statement.setString(3, user.getNickname());
        statement.setString(4, user.getGender());
//        statement.setDate(5, (Date) user.getRegDate());
        statement.setInt(5, user.getState());
        statement.executeUpdate();
        conn.close();


    }
}
