package com.spring.boot.example.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * 当引入数据源的jar包而又不想配置数据源时可以通过以下方式过滤
 * 1、@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
 * 2、在配置文件中加入过滤配置 spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
 *
 *
 * Spring-boot-jersey-sample
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboApplication {
    public static void main( String[] args ) {
        SpringApplication application = new SpringApplication(DubboApplication.class);
        application.run(args);
    }
}
