package com.lzx.aop.jdk;

public class Target implements TargetInterface{
    @Override
    public void save() {
        System.out.println("save running...");
    }

    @Override
    public void insert(String username) {
        System.out.println("insert " + username);
    }
}
