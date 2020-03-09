package org.spring.boot.example.servlet.config;

import org.spring.boot.example.servlet.bean.AppConfig;
import org.spring.boot.example.servlet.bean.InitConfig;
import org.spring.boot.example.servlet.filters.MyFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.Filter;

/**
 * Java配置类--@Bean的用法示例
 * @ClassName JavaBeanConfig
 * @Author huyaxi
 * @DATE 2019/7/5 16:20
 */
@Component
public class JavaBeanConfig {

    @Resource
    private ApplicationContext applicationContext;

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public AppConfig appConfig(){
        AppConfig appConfig = new AppConfig(applicationContext);
        appConfig.setInitConfig(initConfig());
        return appConfig;
    }

    private InitConfig initConfig(){
        InitConfig initConfig = new InitConfig();
        initConfig.setAppName("Servlet App");
        initConfig.setAuthor("胡亚曦");
        return initConfig;
    }


    @Bean
    public Filter filter(){
        return new MyFilter();
    }
}
