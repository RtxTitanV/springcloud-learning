package com.rtxtitanv.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.util.ZuulRuntimeException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.filter.ErrorFilter
 * @description error类型的自定义过滤器
 * @date 2020/3/3 23:36
 */
@Component
public class ErrorFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(ErrorFilter.class);
    private static final String SEND_ERROR_FILTER_RAN = "sendErrorFilter.ran";

    /**
     * 过滤器类型，有pre、routing、post、error四种
     *
     * @return 代表过滤器类型的字符串
     */
    @Override
    public String filterType() {
        return "error";
    }

    /**
     * 过滤器执行顺序，数值越小优先级越高
     *
     * @return 代表过滤器执行顺序的int值
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否进行过滤
     *
     * @return true：过滤，false：不过滤
     */
    @Override
    public boolean shouldFilter() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        return requestContext.getThrowable() != null && !requestContext.getBoolean(SEND_ERROR_FILTER_RAN, false);
    }

    /**
     * 自定义的过滤器逻辑，当shouldFilter()返回true时会执行
     *
     * @return Object
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        // 获取请求上下文
        RequestContext requestContext = RequestContext.getCurrentContext();
        // 获取ZuulException
        ZuulException zuulException = this.findZuulException(requestContext.getThrowable());
        logger.error("系统异常拦截开始", zuulException);
        // 获取响应对象
        HttpServletResponse response = requestContext.getResponse();
        response.setContentType("application/json; charset=utf8");
        response.setCharacterEncoding("utf8");
        response.setStatus(zuulException.nStatusCode);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.print("code:" + zuulException.nStatusCode + ",message:\"" + zuulException.getMessage() + "\"");
        } catch (IOException ioException) {
            logger.error("message: " + ioException.getMessage());
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
        return null;
    }

    /**
     * 获取ZuulException
     *
     * @param throwable throwable
     * @return ZuulException
     */
    private ZuulException findZuulException(Throwable throwable) {

        if (throwable.getCause() instanceof ZuulRuntimeException) {
            return (ZuulException)throwable.getCause().getCause();
        }

        if (throwable.getCause() instanceof ZuulException) {
            return (ZuulException)throwable.getCause();
        }

        if (throwable instanceof ZuulException) {
            return (ZuulException)throwable;
        }
        return new ZuulException(throwable, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, null);
    }
}