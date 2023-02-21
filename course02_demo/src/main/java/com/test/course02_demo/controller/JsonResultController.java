package com.test.course02_demo.controller;

import com.test.course02_demo.entity.JsonResult;
import com.test.course02_demo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonresult")
public class JsonResultController {
    @RequestMapping("/user")
    public JsonResult<User> getUser(){
        User user = new User(1, "张三","123456");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList(){
        List<User> userList = new ArrayList<>();
        User user1 = new User(1,"张三","1234565");
        User user2 = new User(1,"李四","231456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList,"获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMap(){
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1,"王五",null);
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return new JsonResult<>(map);
    }

}
