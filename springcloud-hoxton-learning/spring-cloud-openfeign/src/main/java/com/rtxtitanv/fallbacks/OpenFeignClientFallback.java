package com.rtxtitanv.fallbacks;

import com.rtxtitanv.feignclient.OpenFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.fallbacks.OpenFeignClientImpl
 * @description OpenFeignClient的降级类
 * @date 2020/2/20 18:19
 */
@Component
public class OpenFeignClientFallback implements OpenFeignClient {

    @Override
    public String openFeignTest() {
        return "home fall back";
    }
}
