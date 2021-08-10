package com.mangxiao.nacos.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:基于nacos的服务注册与发现
 * @author:mangxiao2018@126.com
 * @date:2021-4-23
 */
@RestController
public class ApplicationController {

    @GetMapping("/service")
    public String service(){
        return "test";
    }
}
