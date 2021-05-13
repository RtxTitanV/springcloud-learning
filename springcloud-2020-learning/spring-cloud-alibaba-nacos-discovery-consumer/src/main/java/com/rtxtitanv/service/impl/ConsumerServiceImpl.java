package com.rtxtitanv.service.impl;

import com.rtxtitanv.feignclient.OpenFeignClient;
import com.rtxtitanv.service.ConsumerService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.impl.ConsumerServiceImpl
 * @description ConsumerService实现类
 * @date 2021/5/1 16:42
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancerClient loadBalancerClient;
    @Resource
    private WebClient.Builder webClientBuilder;
    @Resource
    private OpenFeignClient openFeignClient;

    @Override
    public String consumerTest() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        String url = serviceInstance.getUri() + "/home";
        return restTemplate.getForObject(url, String.class);
    }

    @Override
    public String consumerTest1() {
        return restTemplate.getForObject("http://nacos-discovery-provider/home", String.class);
    }

    @Override
    public Mono<String> consumerTest2() {
        return webClientBuilder.baseUrl("http://nacos-discovery-provider")
                .build()
                .get()
                .uri("/home")
                .retrieve()
                .bodyToMono(String.class);
    }

    @Override
    public String consumerTest3() {
        return openFeignClient.openFeignTest();
    }
}