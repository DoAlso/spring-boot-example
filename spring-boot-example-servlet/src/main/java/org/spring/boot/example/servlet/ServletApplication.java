package org.spring.boot.example.servlet;

import org.spring.boot.example.servlet.bean.AppConfig;
import org.spring.boot.example.servlet.listener.MyCustomListener;
import org.spring.boot.example.servlet.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

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
    @Value("${spring.test.value}")
    private static String value;

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication application = new SpringApplication(ServletApplication.class);
        //application.addListeners(new MyListener());
        application.addListeners(new MyCustomListener());
        application.run(args);
        System.out.println(value);
    }


    @Configuration
    public class ApplicationConfig {

        @Autowired
        private AppConfig appConfig;

        public void app(){
            System.out.println(appConfig.getInitConfig().getAppName());
            System.out.println(appConfig.getInitConfig().getAuthor());
        }
    }
}
