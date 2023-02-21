package com.test.course02_demo.controller;

import com.test.course02_demo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/user")
    public User getuser(){
        return new User(1,"张望","123456");
    }

    @RequestMapping("/list")
    public List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "张三", "123456");
        User user2 = new User(2, "里斯", "123455");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    @RequestMapping("/map")
    public Map<String, Object> getMap(){
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1,"李四",null);
        map.put("用户名",user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return map;
    }
}
