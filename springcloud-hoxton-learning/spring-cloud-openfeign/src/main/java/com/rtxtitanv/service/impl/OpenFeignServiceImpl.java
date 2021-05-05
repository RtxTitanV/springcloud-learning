package com.rtxtitanv.service.impl;

import com.rtxtitanv.feignclient.OpenFeignClient;
import com.rtxtitanv.service.OpenFeignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.service.impl.OpenFeignServiceImpl
 * @description OpenFeignService实现类
 * @date 2020/2/20 18:18
 */
@Service
public class OpenFeignServiceImpl implements OpenFeignService {

    @Resource
    private OpenFeignClient openFeignClient;

    @Override
    public String openFeign() {
        return openFeignClient.openFeignTest();
    }
}
