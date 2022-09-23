package com.lzx.aop.cglib;

public class Aspect {
    public void preAction() {
        System.out.println("前置增强");
    }

    public String preInsert(String username) {
        System.out.println("前置Insert增强");
        return "preInsert(" + username + ")";
    }
}
