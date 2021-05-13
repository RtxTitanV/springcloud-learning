package com.rtxtitanv.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.config.RestTemplateConfig
 * @description RestTemplate配置类
 * @date 2021/5/1 16:36
 */
@Configuration
public class RestTemplateConfig {

    @LoadBalanced
    @Bean(name = "restTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}