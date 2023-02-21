package com.test.course12_demo.service;

import com.test.course12_demo.entity.User;

import com.test.course12_demo.event.MyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private ApplicationContext applicationContext;

    /**
     * 发布事件
     * @return
     */
    public User getUser2(){
        User user = new User(1l, "席宇99", "99999999");
        //发布事件
        MyEvent event = new MyEvent(this, user);
        applicationContext.publishEvent(event);
        return user;
    }

    /**
     * 获取用户信息
     * @return
     */
    public User getUser(){
        //实际中会根据具体的业务场景，从数据库中查询对应的信息
        return new User(1l, "席宇", "123456");
    }
}
