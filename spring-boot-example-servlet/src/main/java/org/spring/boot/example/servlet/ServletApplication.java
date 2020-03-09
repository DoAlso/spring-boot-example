package org.spring.boot.example.servlet;

import org.spring.boot.example.servlet.bean.AppConfig;
import org.spring.boot.example.servlet.config.CustomSpringApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;

/**
 * Hello world!
 * 当引入数据源的jar包而又不想配置数据源时可以通过以下方式过滤
 * 1、@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
 * 2、在配置文件中加入过滤配置 spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
 * 3、SpringBoot的IOC容器中Bean的生命周期的研究
 * 4、SpringBoot的自定义事件以及自定义监听器的方式
 *
 * Spring-boot-jersey-sample
 * @author Administrator
 */
@ServletComponentScan
@SpringBootApplication
public class ServletApplication {
    @Value("${spring.test.value}")
    private String value;

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        CustomSpringApplication.run(ServletApplication.class,args);
    }


    @Configuration
    public class ApplicationConfig {

        private final AppConfig appConfig;

        public ApplicationConfig(AppConfig appConfig) {
            this.appConfig = appConfig;
        }

        public void app(){
            System.out.println(appConfig.getInitConfig().getAppName());
            System.out.println(appConfig.getInitConfig().getAuthor());
            System.out.println(value);
        }

        public void annotations(){
            Annotation[] annotations = this.getClass().getAnnotations();
            for(Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }
        }
    }
}
