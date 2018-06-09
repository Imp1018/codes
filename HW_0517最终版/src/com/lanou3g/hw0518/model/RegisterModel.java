package com.lanou3g.hw0518.model;

import com.lanou3g.hw0518.pojo.User;
import com.lanou3g.hw0518.util.JDBCUtil;
import com.lanou3g.hw0518.util.MD5Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.lanou3g.hw0518.util.MD5Util.MD5;

public class RegisterModel {


    public boolean register(User user) {
        Connection conn = JDBCUtil.getConn();

        try {
            //开启事务
            //   conn.setAutoCommit(false);
            String sqlInsert = "INSERT INTO user (username,pwd,nickname,gender) VALUES (?,?,?,?)";

            PreparedStatement psInsert = conn.prepareStatement(sqlInsert);

            psInsert.setString(1, user.getUsername());
            //psInsert.setString(2, MD5WithSalt(user.getPassword()));
            psInsert.setString(2, user.getPassword());
            psInsert.setString(3, user.getNickname());
            psInsert.setString(4, user.getGender());
            //执行
            psInsert.executeUpdate();

            //查询刚刚插入的主键
            String getIDSql = "SELECT MAX(uid) FROM user ";
            PreparedStatement psID = conn.prepareStatement(getIDSql);
            ResultSet rs = psID.executeQuery();
            rs.next();

            int uid = rs.getInt(1);
            rs.close();
            psID.close();

            //查询爱好的id 然后插入到user_hobby表中
            String hobbySql = "SELECT hid FROM hobby WHERE opt = ?";
            String hobbyInsertSQL = "INSERT INTO user_hobby(hid, uid) VALUES ( ?, ?)";
            //sql语句预编译
            PreparedStatement hobbyPs = conn.prepareStatement(hobbySql);
            PreparedStatement hobbyInsertPs = conn.prepareStatement(hobbyInsertSQL);
            for (String hobby : user.getHobbies()) {
                hobbyPs.setString(1, hobby);
                ResultSet hobbyRs = hobbyPs.executeQuery();
                hobbyRs.next();
                int hid = hobbyRs.getInt(1);

                hobbyInsertPs.setInt(1, hid);
                hobbyInsertPs.setInt(2, uid);

                hobbyInsertPs.executeUpdate();
                hobbyRs.close();

            }


            //提交事务
//            conn.commit();

            return true;//注册成功
        } catch (Exception e) {
            try {
                //在catch中回滚
                //如果哪条sql抛异常 我们可以回滚到sql执行之前
                conn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }


        return false;
    }


    public boolean hasThisName(String username) {
        String sql = "select count(*) from user where username = ?";

        Connection conn = JDBCUtil.getConn();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int count = rs.getInt(1);

            ps.close();

            rs.close();

            return count > 0;


        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }


}
