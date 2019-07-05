package org.spring.boot.example.servlet.config;

import org.spring.boot.example.servlet.bean.AppConfig;
import org.spring.boot.example.servlet.bean.InitConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Java配置类--@Bean的用法示例
 * @ClassName JavaBeanConfig
 * @Author huyaxi
 * @DATE 2019/7/5 16:20
 */
@Component
public class JavaBeanConfig {

    @Bean(initMethod = "init")
    public AppConfig appConfig(){
        AppConfig appConfig = new AppConfig();
        appConfig.setInitConfig(initConfig());
        return appConfig;
    }

    @Bean
    public InitConfig initConfig(){
        InitConfig initConfig = new InitConfig();
        initConfig.setAppName("Servlet App");
        initConfig.setAuthor("胡亚曦");
        return initConfig;
    }
}
