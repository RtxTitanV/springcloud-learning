package com.rtxtitanv.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.ProviderController
 * @description ProviderController
 * @date 2021/4/30 18:01
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @GetMapping("/home")
    public String home() {
        return "ip:" + ip + ",port:" + port;
    }
}