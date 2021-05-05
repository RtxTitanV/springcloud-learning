package com.rtxtitanv.controller;

import com.rtxtitanv.service.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.OpenFeignController
 * @description OpenFeignController
 * @date 2020/2/20 18:13
 */
@RestController
public class OpenFeignController {

    @Autowired
    private OpenFeignService openFeignService;

    @GetMapping("/openfeign")
    public String openFeign() {
        return openFeignService.openFeign();
    }
}