package com.rtxtitanv.feignclient;

import com.rtxtitanv.fallbacks.OpenFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.feignclient.OpenFeignClient
 * @description 声明式REST服务调用接口
 * @date 2020/2/20 18:13
 */
@FeignClient(value = "eureka-client", fallback = OpenFeignClientFallback.class)
public interface OpenFeignClient {
    /**
     * 声明式REST服务调用接口方法，调用服务eureka-client的/home
     * @return 调用eureka-client返回的结果
     */
    @GetMapping("/home")
    String openFeignTest();
}