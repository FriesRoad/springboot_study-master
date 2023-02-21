package com.test.course04_demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Resource
    private MicroServiceUrl microServiceUrl;

    @RequestMapping("/config")
    public String testConfig(){
        LOGGER.info("=====获取的订单服务地址为: {}", microServiceUrl.getOrderUrl());
        LOGGER.info("=====获取的用户服务地址为: {}", microServiceUrl.getUserUrl());
        LOGGER.info("=====获取购物车服务地址为: {}",microServiceUrl.getShoppingUrl());

        return  "success";
    }

}
