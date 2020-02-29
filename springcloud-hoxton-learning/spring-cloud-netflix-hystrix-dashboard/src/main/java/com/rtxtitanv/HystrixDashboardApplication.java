package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.HystrixDashboardApplication
 * @description 主启动类
 * @date 2020/2/27 17:19
 */
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
