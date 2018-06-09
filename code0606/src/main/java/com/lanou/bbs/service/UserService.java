package com.lanou.bbs.service;

import com.lanou.bbs.dao.UserDao;
import com.lanou.bbs.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserService {
    @Autowired
    private UserDao userdao;

    public User login(User user) throws SQLException {
        // 调用dao,通过username查询数据库
        User u = userdao.findByUsername(user.getName());

        if (u != null && u.getPassword().equals(user.getPassword())) { // 登录成功
                return u;
        } else { // 登录失败
                return null;
        }
    }

    public boolean register(User user)  {
        User u = null;
        try {
            u=userdao.findByUsername(user.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (u!=null){
            return false;
        }else {
            try {
                userdao.add(user);
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }

            return true;
        }
    }
}
