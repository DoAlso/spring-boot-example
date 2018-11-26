package org.spring.boot.example.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 * 过滤掉数据源配置
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},
        scanBasePackages = {"org.spring.boot.example.servlet.repository"})
public class ServletApplication {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication.run(ServletApplication.class, args);
    }
}
