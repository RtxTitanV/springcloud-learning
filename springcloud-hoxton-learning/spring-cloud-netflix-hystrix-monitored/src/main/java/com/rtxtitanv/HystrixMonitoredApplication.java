package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.HystrixMonitoredApplication
 * @description 主启动类
 * @date 2020/2/27 18:47
 */
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class HystrixMonitoredApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMonitoredApplication.class, args);
    }
}