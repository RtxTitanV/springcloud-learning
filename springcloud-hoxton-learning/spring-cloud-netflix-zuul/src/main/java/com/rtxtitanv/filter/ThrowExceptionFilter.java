package com.rtxtitanv.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.filter.ThrowExceptionFilter
 * @description pre类型的自定义过滤器,抛出异常,测试error过滤器
 * @date 2020/3/3 23:37
 */
@Component
public class ThrowExceptionFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(ThrowExceptionFilter.class);

    /**
     * 过滤器类型,有pre、routing、post、error四种
     * @return 代表过滤器类型的字符串
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序,数值越小优先级越高
     * @return 代表过滤器执行顺序的int值
     */
    @Override
    public int filterOrder() {
        return -1;
    }

    /**
     * 是否进行过滤
     * @return true:过滤,false:不过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 自定义的过滤器逻辑,当shouldFilter()返回true时会执行
     * @return Object
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        logger.info("抛出一个RuntimeException进行测试");
        this.throwException();
        return null;
    }

    /**
     * 抛出一个RuntimeException,用于测试error过滤器
     */
    private void throwException() {
        throw new RuntimeException("error");
    }
}
