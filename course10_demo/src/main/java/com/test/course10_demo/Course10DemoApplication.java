package com.test.course10_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.course10_demo.dao")
public class Course10DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Course10DemoApplication.class, args);
    }

}
