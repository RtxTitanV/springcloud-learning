package com.rtxtitanv.controller;

import com.rtxtitanv.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.HystrixController
 * @description HystrixController
 * @date 2020/2/25 19:08
 */
@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/hystrix")
    public String hystrix() {
        return hystrixService.hystrix();
    }
}