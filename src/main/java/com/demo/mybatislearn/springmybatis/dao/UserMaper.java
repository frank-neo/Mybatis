package com.demo.mybatislearn.springmybatis.dao;

import com.demo.mybatislearn.springmybatis.pojo.Order;
import com.demo.mybatislearn.springmybatis.pojo.User;

import java.util.List;

public interface UserMaper {

    List<Order> getUserOrders(int id);
    User getUserById(int id);
}
