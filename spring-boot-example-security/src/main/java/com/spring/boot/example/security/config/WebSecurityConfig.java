package com.spring.boot.example.security.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

/**
 * @ClassName WebSecurityConfig
 * @Author huyaxi
 * @DATE 2019/7/3 17:08
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 这个是webMvcConfigurerAdapter的默认
     * 身份认证配置，以下配置实现了三个作用
     * 1、确保对我们的应用程序的任何请求都要求用户进行身份验证
     * 2、允许用户使用基于表单的登录进行身份验证
     * 3、允许用户使用HTTP基本身份验证进行身份验证
     * @param httpSecurity
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .successHandler(new SavedRequestAwareAuthenticationSuccessHandler())
                .and()
                .httpBasic();
    }
}
