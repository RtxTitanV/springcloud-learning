package com.rtxtitanv.controller;

import com.rtxtitanv.service.OpenfeignMonitoredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.controller.OpenfeignMonitoredController
 * @description OpenfeignMonitoredController
 * @date 2020/2/27 18:55
 */
@RestController
public class OpenfeignMonitoredController {

    @Autowired
    private OpenfeignMonitoredService openfeignMonitoredService;

    @GetMapping("/openfeign")
    public String openFeign() {
        return openfeignMonitoredService.openFeign();
    }
}
