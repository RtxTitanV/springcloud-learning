package com.rtxtitanv.fallbacks;

import com.rtxtitanv.feignclient.SleuthZipkinClient;
import org.springframework.stereotype.Component;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.fallbacks.SleuthZipkinFallback
 * @description SleuthZipkinClient的降级类
 * @date 2020/3/16 12:35
 */
@Component
public class SleuthZipkinFallback implements SleuthZipkinClient {
    @Override
    public String toSleuthZipkinA() {
        return "调用服务sleuth-zipkin-a的/home失败";
    }

    @Override
    public String toSleuthZipkinA2() {
        return "调用服务sleuth-zipkin-a的/toSleuthZipkinB失败";
    }
}
