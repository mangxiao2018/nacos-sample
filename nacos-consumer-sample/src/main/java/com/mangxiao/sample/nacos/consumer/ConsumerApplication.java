package com.mangxiao.sample.nacos.consumer;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @LoadBalanced
    @Bean
    //@SentinelRestTemplate(urlCleanerClass = UrlCleaner.class, urlCleaner = "clean")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @LoadBalanced
    @Bean
    @SentinelRestTemplate
    public RestTemplate restTemplate1() {
        return new RestTemplate();
    }
}
