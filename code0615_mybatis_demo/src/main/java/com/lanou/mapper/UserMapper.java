package com.lanou.mapper;

import com.lanou.entity.User;


public interface UserMapper {
   User findById(Integer id);
   int  update(User user);
}
