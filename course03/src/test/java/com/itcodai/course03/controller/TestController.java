package com.itcodai.course03.controller;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

//    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/log")
    public String testLog(){
        logger.debug("————测试日志debug级别打印————");
        logger.info("————测试日志info级别打印————");
        logger.error("————测试日志error级别打印————");
        logger.warn("————测试日志warn级别打印————");

        String str1 = "blog.test.com";
        String str2 = "blog.csdn.net/eson_15";
        logger.info("——————测试数据一：{}；测试数据二：{}", str1, str2);

        return "success";
    }

}
