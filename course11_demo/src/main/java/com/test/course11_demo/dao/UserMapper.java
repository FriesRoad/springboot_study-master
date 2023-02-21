package com.test.course11_demo.dao;


import com.test.course11_demo.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {

    @Insert("insert into user (user_name, password) values (#{username}, #{password})")
    Integer insertUser(User user);
}
