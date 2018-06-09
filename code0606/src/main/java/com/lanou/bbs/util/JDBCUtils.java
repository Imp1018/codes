package com.lanou.bbs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

    private static final String URL = "jdbc:mysql://localhost:3306/bbs";
    private static String USERNAME ="root";
    private static String PASSWORD = "123456";

    //注册驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}