package com.rtxtitanv.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.filter.PreFilter
 * @description pre类型的自定义过滤器
 * @date 2020/3/2 12:07
 */
@Component
public class PreFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(PreFilter.class);

    /**
     * 过滤器类型，有pre、routing、post、error四种
     * @return 代表过滤器类型的字符串
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序，数值越小优先级越高
     * @return 代表过滤器执行顺序的int值
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否进行过滤
     * @return true：过滤，false：不过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 自定义的过滤器逻辑，当shouldFilter()返回true时会执行
     * @return Object
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //获取请求上下文
        RequestContext requestContext = RequestContext.getCurrentContext();
        //获取请求对象
        HttpServletRequest request = requestContext.getRequest();
        logger.info("method:{},url:{}", request.getMethod(), request.getRequestURL().toString());

        //获取请求参数token的值
        String token = request.getParameter("token");
        //token不为null，空串或空白字符串时进行路由转发，否则不进行路由转发
        if (StringUtils.isNotBlank(token)) {
            logger.info("存在token");
            //对请求进行路由
            requestContext.setSendZuulResponse(true);
            //设置响应状态码
            requestContext.setResponseStatusCode(200);
            requestContext.set("tokenIsExist", true);
            return null;
        } else {
            logger.warn("token不存在");
            //不对请求进行路由
            requestContext.setSendZuulResponse(false);
            //设置响应状态码
            requestContext.setResponseStatusCode(401);
            //获取响应对象
            HttpServletResponse response = requestContext.getResponse();
            response.setContentType("application/json; charset=utf8");
            response.setCharacterEncoding("utf8");
            PrintWriter writer = null;
            try {
                writer = response.getWriter();
                writer.write("token不存在");
            } catch (IOException ioException) {
                logger.error("message: " + ioException.getMessage());
            } finally {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            }
            requestContext.set("tokenIsExist", false);
            return null;
        }
    }
}
