package com.dream.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * 全面扩展（接管）spring mvc配置
 * 如果项 diy一些定制化的功能，只需定义这个组件，然后将它交给SpringBoot，SpringBoot就会自动装配
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    @Bean
//    public ViewResolver myViewResolver() {
//        return new MyViewResolver();
//    }
//
//    /**
//     * 自定义一个试图解析器
//     *
//     */
//    public static class MyViewResolver implements ViewResolver {
//
//        @Override
//        public View resolveViewName(String s, Locale locale) throws Exception {
//            return null;
//        }
//    }


    /**
     * 视图跳转
     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//    }

    /**
     * 自定义国际化组件
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }

    /**
     * 添加拦截器
     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/hello/*", "/index", "/login", "/index.html", "/css/*", "/js/*", "/img/*");
//    }
}
