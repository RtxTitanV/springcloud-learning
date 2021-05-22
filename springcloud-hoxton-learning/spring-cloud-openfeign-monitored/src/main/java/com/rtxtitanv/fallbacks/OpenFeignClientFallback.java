package com.rtxtitanv.fallbacks;

import com.rtxtitanv.feignclient.OpenfeignClient;
import org.springframework.stereotype.Component;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.fallbacks.OpenFeignClientFallback
 * @description OpenFeignClient的降级类
 * @date 2020/2/27 18:55
 */
@Component
public class OpenFeignClientFallback implements OpenfeignClient {

    @Override
    public String openFeignTest() {
        return "home fall back";
    }
}