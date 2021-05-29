package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.EurekaServerApplication
 * @description eureka server 主启动类
 * @date 2020/2/13 11:34
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}