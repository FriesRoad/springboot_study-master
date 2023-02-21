package com.test.course12_demo.event;

import com.test.course12_demo.entity.User;
import javafx.application.Application;
import org.springframework.context.ApplicationEvent;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 自定义事件
 */
public class MyEvent extends ApplicationEvent {
    private User user;
    public MyEvent(Object source, User user){
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
