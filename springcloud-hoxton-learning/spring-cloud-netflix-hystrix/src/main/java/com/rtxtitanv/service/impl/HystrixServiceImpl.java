package com.rtxtitanv.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rtxtitanv.service.HystrixService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.impl.HystrixServiceImpl
 * @description HystrixService实现类
 * @date 2020/2/25 19:10
 */
@Service
public class HystrixServiceImpl implements HystrixService {

    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixFallBack")
    @Override
    public String hystrix() {
        return restTemplate.getForObject("http://eureka-client/home", String.class);
    }

    /**
     * 降级方法
     * @return 服务调用失败提示信息
     */
    private String hystrixFallBack() {
        return "fall back";
    }
}