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
public class AuthZullFilter2 extends ZuulFilter {

    @Override
    public String filterType() {
        //预处理拦截器
        return "pre";
    }

    @Override
    public int filterOrder() {
        //拦截器链的顺序
        return 1;
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
        System.out.println("-------------拦截器2");
        return null;
    }
}
