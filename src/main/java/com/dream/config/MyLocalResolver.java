package com.dream.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        // 获取请求中的语言参数
        String language = httpServletRequest.getParameter("l");
        // 如果没有配置，就是用默认的
        Locale locale = Locale.getDefault();

        if (!StringUtils.isEmpty(language)) {
            // zh_CN
            String[] params = language.split("_");
            // 国家地区
            locale = new Locale(params[0], params[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
