package com.rtxtitanv.controller;

import com.rtxtitanv.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.ConsumerController
 * @description ConsumerController
 * @date 2021/4/30 18:02
 */
@RestController
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping("/test")
    public String consumerTest() {
        return consumerService.consumerTest();
    }

    @GetMapping("/test1")
    public String consumerTest1() {
        return consumerService.consumerTest1();
    }

    @GetMapping("/test2")
    public Mono<String> consumerTest2() {
        return consumerService.consumerTest2();
    }

    @GetMapping("/test3")
    public String consumerTest3() {
        return consumerService.consumerTest3();
    }
}