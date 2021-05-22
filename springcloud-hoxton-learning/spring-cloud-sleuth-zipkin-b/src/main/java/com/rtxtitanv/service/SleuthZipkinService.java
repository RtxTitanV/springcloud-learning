package com.rtxtitanv.service;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.SleuthZipkinService
 * @description SleuthZipkinService
 * @date 2020/3/16 12:30
 */
public interface SleuthZipkinService {
    /**
     * 调用服务sleuth-zipkin-a的/home
     * @return 调用sleuth-zipkin-a返回的结果
     */
    String toSleuthZipkinA();

    /**
     * 用服务sleuth-zipkin-a的/toSleuthZipkinB
     * @return 调用sleuth-zipkin-a返回的结果
     */
    String toSleuthZipkinA2();
}