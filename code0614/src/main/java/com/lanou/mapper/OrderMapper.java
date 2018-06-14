package com.lanou.mapper;

import com.lanou.entity.Order;

public interface OrderMapper {
    Order findOrderWithUserById(Integer id);
    Order findOrderWithOrderDetailsById(Integer id);
}
