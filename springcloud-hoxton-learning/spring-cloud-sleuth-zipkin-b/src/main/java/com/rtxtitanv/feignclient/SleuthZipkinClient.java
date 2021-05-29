package com.rtxtitanv.feignclient;

import com.rtxtitanv.fallbacks.SleuthZipkinFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.feignclient.SleuthZipkinClient
 * @description 声明式REST服务调用接口
 * @date 2020/3/16 12:33
 */
@FeignClient(value = "sleuth-zipkin-a", fallback = SleuthZipkinFallback.class)
public interface SleuthZipkinClient {
    /**
     * 声明式REST服务调用接口方法，调用服务sleuth-zipkin-a的/home
     *
     * @return 调用sleuth-zipkin-a返回的结果
     */
    @GetMapping("/home")
    String toSleuthZipkinA();

    /**
     * 声明式REST服务调用接口方法，调用服务sleuth-zipkin-a的/toSleuthZipkinB
     *
     * @return 调用sleuth-zipkin-a返回的结果
     */
    @GetMapping("/toSleuthZipkinB")
    String toSleuthZipkinA2();
}