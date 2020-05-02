package com.qf.gateway.zullFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 权限网关
 */
@Component
public class LogZullFilter extends ZuulFilter {

    @Override
    public String filterType() {
        //预处理拦截器
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否拦截
        return true;
    }

    /**
     * 具体的业务逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("-------------日志后拦截器3");
        return null;
    }
}
