package com.mangxiao.nacos.sample.configuration;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @description:默认namespace:public下配置文件获取
 * @author:mangxiao2018@126.com
 * @date:2021-3-31
 */
public class ConfigurationSample {

    public static void main(String[] args) throws NacosException, InterruptedException {
        //使用nacos client远程获取nacos服务上的配置信息
        //nacos server地址
        String serverAddr = "10.108.4.173:8848";
        String namespace = "42d30fdf-37c2-484a-9f8a-5da0eeed6e77";
        //data id
        String dataId = "nacos-simple-demo.yaml";
        //group
        String group = "DEFAULT_GROUP";

        Properties properties =new Properties();
        properties.put("serverAddr",serverAddr);
        properties.put("namespace",namespace);
        //获取配置
        ConfigService configService = NacosFactory.createConfigService(properties);
        // String dataId, String group, long timeoutMs
        String config = configService.getConfig(dataId, group, 5000);
        System.out.println(config);
        //增加配置监听器，当在管理控制台上修改配置时能及时得到变化后的配置，否则还是原配置
        configService.addListener(dataId, group, new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String s) {
                System.out.println("变化后的配置:" + s);
            }
        });

        while (true){
            Thread.sleep(2000);
        }
    }
}
