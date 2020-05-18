package com.rtxtitanv.service;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.service.OpenfeignMonitoredService
 * @description OpenfeignMonitoredService
 * @date 2020/2/27 19:22
 */
public interface OpenfeignMonitoredService {
    /**
     * openfeign声明式REST服务调用测试，调用服务eureka-client的/home
     * @return 调用eureka-client返回的结果
     */
    String openFeign();
}
