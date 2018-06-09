package com.lanou3g.code0426;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dllo on 18/4/26.
 */
public class JdbcUtil {
    private static Connection conn;   //连接对象

    static {
        // 静态代码块
        // 当程序第一次加载这个类的时候就会先执行这个类的静态代码块
        // 并且 整个项目只要不停 只会执行一次
        // 加载MySQL驱动 执行一次就可以
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lan_ou", "root", "123456");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Statement getStatement() {
        try {
            Statement statement = conn.createStatement();
            return statement;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConn() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeResource(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
