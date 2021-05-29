package com.rtxtitanv.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rtxtitanv.service.HystrixMonitoredService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.impl.HystrixMonitoredServiceImpl
 * @description HystrixMonitoredService实现类
 * @date 2020/2/27 18:51
 */
@Service
public class HystrixMonitoredServiceImpl implements HystrixMonitoredService {

    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixFallBack", commandKey = "myHystrixCommand", groupKey = "myGroup",
        threadPoolKey = "myThreadPool")
    @Override
    public String hystrix() {
        return restTemplate.getForObject("http://eureka-client/home", String.class);
    }

    /**
     * 降级方法
     *
     * @return 服务调用失败提示信息
     */
    private String hystrixFallBack() {
        return "fall back";
    }
}