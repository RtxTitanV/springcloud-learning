package com.rtxtitanv.controller;

import com.rtxtitanv.service.SleuthZipkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.SleuthZipkinController
 * @description SleuthZipkinController
 * @date 2020/3/16 12:28
 */
@RestController
public class SleuthZipkinController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.cloud.client.ip-address}")
    private String ip;
    @Autowired
    private SleuthZipkinService sleuthZipkinService;

    @GetMapping("/home")
    public String home() {
        return "ip:" + ip + ",port:" + port;
    }

    @GetMapping("/toSleuthZipkinB")
    public String toSleuthZipkinB() {
        return sleuthZipkinService.toSleuthZipkinB();
    }

    @GetMapping("/toSleuthZipkinB2")
    public String toSleuthZipkinB2() {
        return sleuthZipkinService.toSleuthZipkinB2();
    }
}