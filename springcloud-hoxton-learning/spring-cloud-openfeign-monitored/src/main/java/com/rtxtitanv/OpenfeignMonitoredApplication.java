package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.OpenfeignMonitoredApplication
 * @description 主启动类
 * @date 2020/2/27 18:53
 */
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class OpenfeignMonitoredApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenfeignMonitoredApplication.class, args);
    }
}
