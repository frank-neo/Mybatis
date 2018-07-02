package com.demo.mybatislearn.duoduiduo.dao;

import com.demo.mybatislearn.duoduiduo.Bean.Group;
import com.demo.mybatislearn.duoduiduo.Bean.User;
import com.demo.mybatislearn.duoduiduo.Bean.UserGroup;

import java.util.List;

public interface UserGroupMaper {

    List<Group> getGroupsByUserId(int id);
    List<User> getUsersByGroupId(int id);
    void insertUserGroup(UserGroup userGroup);
}
