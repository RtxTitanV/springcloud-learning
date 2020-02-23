package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.OpenFeignApplication
 * @description 主启动类
 * @date 2020/2/20 17:54
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class OpenFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignApplication.class, args);
    }
}