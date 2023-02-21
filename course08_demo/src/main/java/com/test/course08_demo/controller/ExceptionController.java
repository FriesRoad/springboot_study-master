package com.test.course08_demo.controller;

import com.test.course08_demo.entity.JsonResult;
import com.test.course08_demo.exception.BusinessErrorException;
import com.test.course08_demo.exception.BusinessMsgEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    public static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name, @RequestParam("pass") String pass){
        logger.info("name: {}", name);
        logger.info("pass: {}", pass);
        return new JsonResult();
    }

    @GetMapping("/business")
    public JsonResult testException(){
        try{
            int i = 1 / 0;
        } catch (Exception e){
            throw new BusinessErrorException(BusinessMsgEnum.UNEXPECTED_EXCEPTION);
        }
        return new JsonResult();
    }
}
