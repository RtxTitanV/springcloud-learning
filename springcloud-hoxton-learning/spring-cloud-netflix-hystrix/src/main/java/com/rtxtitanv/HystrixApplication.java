package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.HystrixApplication
 * @description 主启动类
 * @date 2020/2/25 19:05
 */
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}