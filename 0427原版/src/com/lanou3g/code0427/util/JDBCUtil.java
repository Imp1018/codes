package com.lanou3g.code0427.util;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by dllo on 18/4/27.
 */
/*
直接在编码中使用字符串作为配置信息
叫做"硬编码"
缺点:如果希望更改配置内容
需要去编码中找,并且 改动完成后 还需要重新编译
然后上传编译后的代码(体积比较大)
解决方法:引入配置文件
 */
public class JDBCUtil {
    private static String url;
    private static String driverClass;
    private static Properties info = new Properties();

    static {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("JDBCProp.properties");
            info.load(fis);//加载配置信息

            driverClass = info.getProperty("driverClass");
            url = info.getProperty("url");

            Class.forName(driverClass);//加载驱动
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtil.closeAll(fis);
        }
    }


    //获取连接对象
    public static Connection getConn() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Statement getStatement() {
        Connection connection = getConn();
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static PreparedStatement getPreStatement(String sql){
        Connection conn=getConn();
        PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }

    //关闭资源
    public static void closeResource(Statement statement) {
        try {
            //可以从statement 中获取连接对象
            Connection conn = statement.getConnection();
            //关闭资源
            IOUtil.closeAll(statement, conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
