package com.rtxtitanv.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.BusClientController
 * @description BusClientController
 * @date 2020/3/13 11:19
 */
@RefreshScope
@RestController
public class BusClientController {

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/getConfig")
    public String getApplicationName() {
        return applicationName;
    }
}