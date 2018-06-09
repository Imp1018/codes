package study;

import com.lanou3g.code0427.Util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dllo on 18/4/27.
 */
public class SQLTest {
    // 防止 SQL 注入
    public static void main(String[] args) {
        Connection conn = JdbcUtil.getConn();
        String sql = "SELECT * FROM client WHERE username=? AND pwd=?";
        try {
            // 为了防止SQL注入
            // 要使用statement的子类
            // preparedstatement
            // 他在使用的时候 SQL 不需要拼接 字符串
            // 而是使用? 作为变量的占位符
            // 之后 调用 setXXX的方法 去为每个占位符设置内容
            PreparedStatement ps = conn.prepareStatement(sql);
            // 1 代表 SQL 语句中的第一个?
            // "Aa"代表 这个? 对应的值
            ps.setString(1,"Aa");
            ps.setString(2,"123456");
            ResultSet rs=ps.executeQuery();

            if (rs.next()){
                String word=rs.getString("word");
                System.out.println(word);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
