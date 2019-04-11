package com.mmal.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * Description:向mvc中添加自定义组件
 *
 * @author wangyf
 * @date 2019/4/8
 */
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Resource
    private MmalLoginInterceptor mmalLoginInterceptor;

    /**
     *  将自定义得拦截器添加进去
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mmalLoginInterceptor).addPathPatterns("/**");

    }
}
