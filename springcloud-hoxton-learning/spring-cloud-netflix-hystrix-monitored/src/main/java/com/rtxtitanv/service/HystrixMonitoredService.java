package com.rtxtitanv.service;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.HystrixMonitoredService
 * @description HystrixMonitoredService
 * @date 2020/2/27 18:50
 */
public interface HystrixMonitoredService {

    /**
     * 调用eureka-client，测试hystrix服务降级
     * @return 调用eureka-client返回的结果
     */
    String hystrix();
}