package com.lzm.domain;

public class Order {

    public int id;
    public int money;
    public User user;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
