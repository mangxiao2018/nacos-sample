package com.mangxiao.sample.nacos.consumer.service;

import org.springframework.context.annotation.Bean;

public class FeignConfiguration {
    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }
}
