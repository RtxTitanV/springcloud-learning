package com.rtxtitanv.service;

import org.springframework.stereotype.Service;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.service.SleuthZipkinService
 * @description SleuthZipkinService
 * @date 2020/3/16 12:30
 */
public interface SleuthZipkinService {
    /**
     * 调用服务sleuth-zipkin-b的/home
     * @return 调用sleuth-zipkin-b返回的结果
     */
    String toSleuthZipkinB();

    /**
     * 调用服务sleuth-zipkin-b的/toSleuthZipkinA
     * @return 调用sleuth-zipkin-b返回的结果
     */
    String toSleuthZipkinB2();
}
