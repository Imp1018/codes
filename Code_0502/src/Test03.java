import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by dllo on 18/5/2.
 */
public class Test03 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        long startTime=System.currentTimeMillis();
        insertWithTrans();
        long endTime=System.currentTimeMillis();
        System.out.println("总耗时"+(endTime-startTime)+"ms");
    }


    public static Connection getConn() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lanou3", "root", "123456");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void insertWithTrans() {
        Connection conn=getConn();
        String sql = "Insert into bank(cname,money)values(?,100)";
        try {
            conn.setAutoCommit(false);  // 开启事务
            for (int i = 0; i < 10000; i++) {
                System.out.println("这是第"+i+"次插入");
                PreparedStatement statement=conn.prepareStatement(sql);
                statement.setString(1,"NAME-"+i);
                statement.execute();
                statement.close();
            }
            conn.commit();   // 提交事务
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertNormal() {
        Connection conn = getConn();
        String sql = "Insert into bank(cname,money)values(?,100)";
        for (int i = 0; i < 10000; i++) {
            System.out.println("这是第"+i+"次插入");
            try {
                PreparedStatement statement=conn.prepareStatement(sql);
                statement.setString(1,"name-"+i);
                statement.executeUpdate();   // 执行
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        // 一定要放在 for 的括号 外面
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
