package com.rtxtitanv.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.config.RestTemplateConfig
 * @description RestTemplate配置类
 * @date 2020/2/18 15:35
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
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        // 可以解决ribbon超时时间设置不生效问题
        httpRequestFactory.setReadTimeout(5000);
        httpRequestFactory.setConnectTimeout(5000);
        return new RestTemplate(httpRequestFactory);
    }
}