package com.rtxtitanv.service;

import reactor.core.publisher.Mono;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.ConsumerService
 * @description ConsumerService
 * @date 2021/5/1 16:34
 */
public interface ConsumerService {
    /**
     * 使用RestTemplate进行服务调用测试，使用LoadBalancerClient接口获取服务信息
     * @return 调用nacos-discovery-provider返回的结果
     */
    String consumerTest();

    /**
     * 使用RestTemplate进行服务调用测试
     * @return 调用nacos-discovery-provider返回的结果
     */
    String consumerTest1();

    /**
     * 使用WebClient进行服务调用测试
     * @return 调用nacos-discovery-provider返回的结果
     */
    Mono<String> consumerTest2();

    /**
     * 使用OpenFeign进行服务调用测试
     * @return 调用nacos-discovery-provider返回的结果
     */
    String consumerTest3();
}