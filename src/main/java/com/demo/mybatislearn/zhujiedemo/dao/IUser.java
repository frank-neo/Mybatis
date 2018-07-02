package com.demo.mybatislearn.zhujiedemo.dao;

        import com.demo.mybatislearn.model.User;
        import org.apache.ibatis.annotations.Select;

public interface IUser {

    @Select("select * from user where id= #{id}")
    User getUserByID(int id);
}
