package com.example.practicehibernate.entity;

import jakarta.persistence.*;

@Entity
public class Orders {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderID;

    @Column
    private String itemName;

    @Column
    private Integer cost;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", itemName='" + itemName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
