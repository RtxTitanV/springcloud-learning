package com.rtxtitanv.controller;

import com.rtxtitanv.service.HystrixMonitoredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.controller.HystrixMonitoredController
 * @description HystrixMonitoredController
 * @date 2020/2/27 18:49
 */
@RestController
public class HystrixMonitoredController {

    @Autowired
    private HystrixMonitoredService hystrixMonitoredService;

    @GetMapping("/hystrix")
    public String hystrix() {
        return hystrixMonitoredService.hystrix();
    }
}
