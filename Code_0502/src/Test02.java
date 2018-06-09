import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dllo on 18/5/2.
 */
public class Test02 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn=null;
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lanou3","root","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql1="update  bank " +
                "set money = money - 5 " +
                "where cname = '鸣人'";

        String sql2="update  bank " +
                "set money = money + 5 " +
                "where cname = '佐助'";
        try {
           conn.setAutoCommit(false);  // 开启事务
            Statement statement= conn.createStatement();
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            conn.commit();

            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            // 在catch中进行回滚
            // 当执行SQL出错了 可以出发回滚
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }

    }
}
