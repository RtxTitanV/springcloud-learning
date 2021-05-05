package com.rtxtitanv.service;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.HystrixService
 * @description HystrixService
 * @date 2020/2/25 19:09
 */
public interface HystrixService {

    /**
     * 调用eureka-client，测试hystrix服务降级
     * @return 调用eureka-client返回的结果
     */
    String hystrix();
}