package org.spring.boot.example.servlet;

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
public class ServletApplication {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication.run(ServletApplication.class, args);
    }
}
