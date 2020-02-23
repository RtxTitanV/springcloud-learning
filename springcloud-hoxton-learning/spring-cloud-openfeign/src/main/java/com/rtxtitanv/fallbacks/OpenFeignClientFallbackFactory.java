package com.rtxtitanv.fallbacks;

import com.rtxtitanv.feignclient.OpenFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.fallbacks.OpenFeignClientFallbackFactory
 * @description OpenFeignClient的降级工厂类
 * @date 2020/2/20 20:46
 */
@Component
public class OpenFeignClientFallbackFactory implements FallbackFactory<OpenFeignClient> {
    @Override
    public OpenFeignClient create(Throwable throwable) {
        return () -> "home fallback reason was: " + throwable.getMessage();
    }
}
