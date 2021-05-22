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
import java.io.OutputStream;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.filter.PostFilter
 * @description post类型的自定义过滤器
 * @date 2020/3/2 12:08
 */
@Component
public class PostFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(PostFilter.class);
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    /**
     * 过滤器类型，有pre、routing、post、error四种
     * @return 代表过滤器类型的字符串
     */
    @Override
    public String filterType() {
        return "post";
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
        RequestContext requestContext = RequestContext.getCurrentContext();
        // 判断token是否存在，token存在才进行过滤
        return (boolean) requestContext.get("tokenIsExist");
    }

    /**
     * 自定义的过滤器逻辑，当shouldFilter()返回true时会执行
     * @return Object
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        // 获取请求上下文
        RequestContext requestContext = RequestContext.getCurrentContext();
        // 获取请求对象
        HttpServletRequest request = requestContext.getRequest();
        logger.info("method:{},url:{}", request.getMethod(), request.getRequestURL().toString());

        // 获取请求参数username和password的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // username和passsword正确则进行路由转发，否则不进行路由转发
        if (StringUtils.isNotBlank(username) && USERNAME.equals(username)
                && StringUtils.isNotBlank(password) && PASSWORD.equals(password)) {
            logger.info("用户名密码正确");
            // 对请求进行路由
            requestContext.setSendZuulResponse(true);
            // 设置响应状态码
            requestContext.setResponseStatusCode(200);
            requestContext.set("isVerify", true);
            return null;
        } else {
            logger.warn("用户名或密码不正确");
            // 不对请求进行路由
            requestContext.setSendZuulResponse(false);
            // 设置响应状态码
            requestContext.setResponseStatusCode(401);
            // 获取响应对象
            HttpServletResponse response = requestContext.getResponse();
            response.setContentType("application/json; charset=utf8");
            response.setCharacterEncoding("utf8");
            OutputStream writer = null;
            try {
                // 避免 getWriter() has already been called for this response 问题
                writer = response.getOutputStream();
                writer.write("用户名或密码不正确".getBytes());
            } catch (IOException ioException) {
                logger.error("message: " + ioException.getMessage());
            } finally {
                if (writer != null) {
                    try {
                        writer.flush();
                        writer.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
            requestContext.set("isVerify", false);
            return null;
        }
    }
}