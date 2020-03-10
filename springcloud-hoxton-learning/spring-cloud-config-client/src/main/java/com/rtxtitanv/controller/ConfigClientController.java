package com.rtxtitanv.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.controller.ConfigClientController
 * @description ConfigClientController
 * @date 2020/3/8 18:20
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/getConfig")
    public String getApplicationName() {
        return applicationName;
    }
}
