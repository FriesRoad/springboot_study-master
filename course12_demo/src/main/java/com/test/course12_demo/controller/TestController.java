package com.test.course12_demo.controller;

import com.test.course12_demo.entity.User;
import com.test.course12_demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/listener")
public class TestController {

    @Resource
    private UserService userService;

    @GetMapping("/publish")
    public User publishEvent() {
        return userService.getUser2();
    }

    @GetMapping("/request")
    public String getRequestInfo(HttpServletRequest request){
        System.out.println("requestListener中的初始化的name数据：" + request.getAttribute("name"));
        return "success";
    }

    /**
     * 获取当前在线人数，该方法有bug
     */
    @GetMapping("/total")
    public String getTotalUser(HttpServletRequest request){
        Integer count = (Integer)request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数" + count;
    }

    @GetMapping("/total2")
    public String getTotalUser(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie;
        try{
            //把sessionID记录在浏览器中
            cookie = new Cookie("JSESSIONID", URLEncoder.encode(request.getSession().getId(), "utf-8"));
            cookie.setPath("/");
            //设置cooki有效期为两天
            cookie.setMaxAge(48 * 60 * 60);
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        Integer count = (Integer)request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数" + count;
    }

    @GetMapping("/user")
    public User getUser(HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        return (User) application.getAttribute("user");
    }

}
