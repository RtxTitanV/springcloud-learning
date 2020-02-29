package com.rtxtitanv.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.config.RestTemplateConfig
 * @description RestTemplate配置类
 * @date 2020/2/27 18:49
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 配置RestTemplate
     * @return RestTemplate
     */
    @LoadBalanced
    @Bean(name = "restTemplate")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
