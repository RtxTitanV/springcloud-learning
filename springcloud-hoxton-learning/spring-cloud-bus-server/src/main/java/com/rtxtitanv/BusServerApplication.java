package com.rtxtitanv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.BusServerApplication
 * @description 主启动类
 * @date 2020/3/13 11:08
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class BusServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusServerApplication.class, args);
    }
}
