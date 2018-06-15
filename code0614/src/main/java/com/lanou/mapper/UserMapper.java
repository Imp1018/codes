package com.lanou.mapper;

import com.lanou.entity.User;


public interface UserMapper {
    User findUserWithOrdersAndOrderdetailsAndItemsById(Integer id);
}
