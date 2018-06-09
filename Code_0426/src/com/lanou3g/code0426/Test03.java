package com.lanou3g.code0426;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dllo on 18/4/26.
 */
public class Test03 {
    public static void main(String[] args) {
        String sql="DELETE FROM stu WHERE sNAME ='张三' ";
       Statement statement= JdbcUtil.getStatement();
        try {
            int rows=statement.executeUpdate(sql);
            if (rows>0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.closeResource(statement);
        JdbcUtil.closeConn();   //  放在Main 方法的最后一行
        // 整个项目 写这一遍 就可以
    }

}
