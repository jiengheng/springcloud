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
public class AuthZullFilter  extends ZuulFilter {

    @Override
    public String filterType() {
        //预处理拦截器
        return "pre";
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
        System.out.println("-------------拦截器1");
        try {
            RequestContext currentContext = RequestContext.getCurrentContext();
            HttpServletRequest request = currentContext.getRequest();
            String sign = request.getParameter("sign");

            if (sign != null && sign.length()>0){
                System.out.println("访问带了签名过来...."+sign);
            }else {
                //不放行处理
                currentContext.setSendZuulResponse(false);
                currentContext.getResponse().getWriter().write("valid sign param");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
