package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.SleuthZipkinApplication
 * @description 主启动类
 * @date 2020/3/16 12:04
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SleuthZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinApplication.class, args);
    }
}