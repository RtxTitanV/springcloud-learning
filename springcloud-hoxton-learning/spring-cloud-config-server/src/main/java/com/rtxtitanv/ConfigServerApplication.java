package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.ConfigServerApplication
 * @description 主启动类
 * @date 2020/3/8 17:49
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}