package com.rtxtitanv.service.impl;

import com.rtxtitanv.feignclient.OpenfeignClient;
import com.rtxtitanv.service.OpenfeignMonitoredService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.service.impl.OpenfeignMonitoredServiceImpl
 * @description OpenfeignMonitoredService实现类
 * @date 2020/2/27 19:23
 */
@Service
public class OpenfeignMonitoredServiceImpl implements OpenfeignMonitoredService {

    @Resource
    private OpenfeignClient openFeignClient;

    @Override
    public String openFeign() {
        return openFeignClient.openFeignTest();
    }
}
