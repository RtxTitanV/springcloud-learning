package com.rtxtitanv.controller;

import com.rtxtitanv.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.controller.RibbonController
 * @description RibbonController
 * @date 2020/2/18 15:35
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon")
    public String ribbon() {
        return ribbonService.ribbon();
    }
}
