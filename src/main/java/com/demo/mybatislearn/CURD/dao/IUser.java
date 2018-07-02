package com.demo.mybatislearn.CURD.dao;

import com.demo.mybatislearn.CURD.bean.User;

import java.util.List;

public interface IUser {

    public List<User> getUserList();

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(int userId);

    public User getUser(int id);
}
