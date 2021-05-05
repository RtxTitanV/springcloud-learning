package com.rtxtitanv.service.impl;

import com.rtxtitanv.service.RibbonService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.impl.RibbonServiceImpl
 * @description RibbonService实现类
 * @date 2020/2/18 15:48
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    @Override
    public String ribbon() {
        return restTemplate.getForObject("http://eureka-client/home", String.class);
    }
}
