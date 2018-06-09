import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by dllo on 18/5/2.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lanou3", "root", "123456");
            // 开启事务
            // 把autocommit 关闭  相当于使用begin语句
            conn.setAutoCommit(false);
            String sql1="update  bank " +
                    "set money = money - 5 " +
                    "where cname = '鸣人'";

            String sql2="update  bank " +
                    "set money = money + 5 " +
                    "where cname = '佐助'";
            Statement statement=conn.createStatement();
            statement.executeUpdate(sql1); // 执行SQL1
            statement.executeUpdate(sql2);  //  执行SQL2

            conn.commit();  // 提交事务
            // 关闭资源
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
