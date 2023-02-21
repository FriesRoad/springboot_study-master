//package com.test.course04_demo.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/test")
//public class ConfigController {
//    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ConfigController.class);
//
//    @Value("${url.orderUrl}")
//    private String orderUrl;
//
//    @RequestMapping("/config")
//    public String testConfig(){
//        LOGGER.info("======获取的服务器地址为：{}", orderUrl);
//        return "success";
//    }
//}
