package com.rtxtitanv.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.config.WebClientConfig
 * @description WebClient配置类
 * @date 2021/5/1 18:21
 */
@Configuration
public class WebClientConfig {

    @LoadBalanced
    @Bean(name = "webClientBuilder")
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}