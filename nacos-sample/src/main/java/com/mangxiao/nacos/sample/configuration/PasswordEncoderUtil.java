package com.mangxiao.nacos.sample.configuration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @description:nacos管理控制台登录密码的加密
 * @author:mangixao2018@126.com
 * @date:2021-4-15
 */
public class PasswordEncoderUtil {

    public static void main(String[] args){
        System.out.println(new BCryptPasswordEncoder().encode("123"));
    }
}
