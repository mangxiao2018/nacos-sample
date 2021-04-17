package com.mangxiao.nacos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: service1 start port
 * @author:mangxiao2018@126.com
 * @date:2021-4-16
 */
@SpringBootApplication
@RestController
public class Service1BootStrap {
    public static void main(String[] args){
        SpringApplication.run(Service1BootStrap.class, args);
    }


}
