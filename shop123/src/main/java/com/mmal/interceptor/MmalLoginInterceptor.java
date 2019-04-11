package com.mmal.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:自定义拦截器
 *
 * @author wangyf
 * @date 2019/4/8
 */
@Component
public class MmalLoginInterceptor extends HandlerInterceptorAdapter {


    /**
     * 进入controller层之前调用得方法
     * @param request
     * @param response
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {




        return false;
    }


}
