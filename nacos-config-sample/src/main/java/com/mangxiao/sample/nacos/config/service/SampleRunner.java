package com.mangxiao.sample.nacos.config.service;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.listener.Listener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;
import java.util.concurrent.Executor;

public class SampleRunner implements ApplicationRunner {
    @Autowired
    private NacosConfigManager nacosConfigManager;

    public void run(ApplicationArguments args) throws Exception {
        nacosConfigManager.getConfigService().addListener(
                "nacos-config-custom.properties", "DEFAULT_GROUP", new Listener() {
                    /**
                     * Callback with latest config data.
                     * @param configInfo latest config data for specific dataId in Nacos
                     * server
                     */
                    public void receiveConfigInfo(String configInfo) {
                        Properties properties = new Properties();
                        try {
                            properties.load(new StringReader(configInfo));
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("config changed: " + properties);
                    }

                    public Executor getExecutor() {
                        return null;
                    }
                });
    }
}
