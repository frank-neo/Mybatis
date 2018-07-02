package com.demo.mybatislearn.duoduiduo.dao;

import com.demo.mybatislearn.duoduiduo.Bean.Group;

public interface GroupMaper {

    void insertGroup(Group group);
    Group getGroup(int id);
}
