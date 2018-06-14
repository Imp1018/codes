package com.lanou.entity;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private Date createTime;
    private Integer userId;
    private User user;
    private List<Orderdetail> orderdetails;

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public Order setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", orderdetails=" + orderdetails +
                '}';
    }



    public User getUser() {
        return user;
    }

    public Order setUser(User user) {
        this.user = user;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Order setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Order setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
}
