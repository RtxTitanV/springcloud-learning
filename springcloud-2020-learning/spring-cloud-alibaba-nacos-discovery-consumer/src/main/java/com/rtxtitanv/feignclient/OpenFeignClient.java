package com.rtxtitanv.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.feignclient.OpenFeignClient
 * @description 声明式REST服务调用接口
 * @date 2021/5/1 16:41
 */
@FeignClient(value = "nacos-discovery-provider")
public interface OpenFeignClient {

    /**
     * 声明式REST服务调用接口方法，调用服务nacos-discovery-provider的/home
     *
     * @return 调用nacos-discovery-provider返回的结果
     */
    @GetMapping("/home")
    String openFeignTest();
}