package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.ConfigClientApplication
 * @description 主启动类
 * @date 2020/3/8 17:50
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}