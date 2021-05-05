package com.rtxtitanv.service;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.RibbonService
 * @description RibbonService
 * @date 2020/2/18 15:48
 */
public interface RibbonService {
    /**
     * ribbon负载均衡测试
     * @return 调用eureka-client返回的结果
     */
    String ribbon();
}
