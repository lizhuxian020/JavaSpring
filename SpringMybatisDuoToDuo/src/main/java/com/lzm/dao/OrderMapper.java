package com.lzm.dao;

import com.lzm.domain.Order;

import java.util.List;

public interface OrderMapper {

    public List<Order> findAll();
}
