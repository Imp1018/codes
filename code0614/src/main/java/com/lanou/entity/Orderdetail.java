package com.lanou.entity;

public class Orderdetail {
    private Integer id;
    private Integer orderId;
    private  Integer itemId;
    private Integer itemNum;

    @Override
    public String toString() {
        return "Orderdetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", itemId=" + itemId +
                ", itemNum=" + itemNum +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Orderdetail setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Orderdetail setOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Orderdetail setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public Orderdetail setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
        return this;
    }
}
