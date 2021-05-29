package com.rtxtitanv.service;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.OpenFeignService
 * @description OpenFeignService
 * @date 2020/2/20 18:14
 */
public interface OpenFeignService {
    /**
     * openfeign声明式REST服务调用测试，调用服务eureka-client的/home
     *
     * @return 调用eureka-client返回的结果
     */
    String openFeign();
}