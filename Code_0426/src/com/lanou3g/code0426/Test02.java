package com.lanou3g.code0426;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by dllo on 18/4/26.
 */
public class Test02 {
    public static void main(String[] args) {
        try {
            // 整个项目中 驱动只需要注册一次
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 每一次执行SQL 都 固定写的代码
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lan_ou", "root", "123456");
            Statement statement = conn.createStatement();
            String sql = "insert into stu (sid,sname,gender,age)values('123','张三','男',18)";
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
            conn.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
