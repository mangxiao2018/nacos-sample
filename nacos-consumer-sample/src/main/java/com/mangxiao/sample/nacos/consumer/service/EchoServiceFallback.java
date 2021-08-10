package com.mangxiao.sample.nacos.consumer.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class EchoServiceFallback implements EchoService{
    public String echo(@PathVariable("str") String str) {
        return "echo fallback";
    }

    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return "divide fallback";
    }

    public String notFound() {
        return "notFound fallback";
    }
}
