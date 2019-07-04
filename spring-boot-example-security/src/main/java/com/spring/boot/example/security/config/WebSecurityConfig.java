package com.spring.boot.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebSecurityConfig
 * @Author huyaxi
 * @DATE 2019/7/3 17:08
 */
@EnableWebSecurity
public class WebSecurityConfig implements WebMvcConfigurer {

    @Bean
    public UserDetailsService userDetailsService() throws Exception{
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("admin").password("123456").roles("USER").build());
        return manager;
    }


    /**
     * 这个是webMvcConfigurerAdapter的默认
     * 身份认证配置，以下配置实现了三个作用
     * 1、确保对我们的应用程序的任何请求都要求用户进行身份验证
     * 2、允许用户使用基于表单的登录进行身份验证
     * 3、允许用户使用HTTP基本身份验证进行身份验证
     * @param httpSecurity
     * @throws Exception
     */
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
