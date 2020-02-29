package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.TurbineApplication
 * @description 主启动类
 * @date 2020/2/27 17:56
 */
@EnableTurbine
@EnableEurekaClient
@SpringBootApplication
public class TurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}
