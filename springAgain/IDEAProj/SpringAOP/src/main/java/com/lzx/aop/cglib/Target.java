package com.lzx.aop.cglib;


public class Target {
    public void save() {
        System.out.println("save running...");
    }

    public void insert(String username) {
        System.out.println("insert " + username);
    }
}
