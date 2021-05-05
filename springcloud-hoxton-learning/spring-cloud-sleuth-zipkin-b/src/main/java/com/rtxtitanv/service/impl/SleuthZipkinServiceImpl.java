package com.rtxtitanv.service.impl;

import com.rtxtitanv.feignclient.SleuthZipkinClient;
import com.rtxtitanv.service.SleuthZipkinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.impl.SleuthZipkinServiceImpl
 * @description SleuthZipkinService实现类
 * @date 2020/3/16 12:31
 */
@Service
public class SleuthZipkinServiceImpl implements SleuthZipkinService {

    @Resource
    private SleuthZipkinClient sleuthZipkinClient;

    @Override
    public String toSleuthZipkinA() {
        return sleuthZipkinClient.toSleuthZipkinA();
    }

    @Override
    public String toSleuthZipkinA2() {
        return sleuthZipkinClient.toSleuthZipkinA2();
    }
}
