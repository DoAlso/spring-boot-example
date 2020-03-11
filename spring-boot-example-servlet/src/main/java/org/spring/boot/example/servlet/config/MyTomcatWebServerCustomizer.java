package org.spring.boot.example.servlet.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * 自定义配置SpringBoot嵌入式web服务器
 * @ClassName MyTomcatWebServerCustomizer
 * @Author huyaxi
 * @DATE 2020/3/9 10:26
 */
@Component
public class MyTomcatWebServerCustomizer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        System.out.println("MyTomcatWebServerCustomizer: >> 此处可对tomcat服务器进行自定义的配置 >>");
        factory.setPort(80);
        System.out.println("MyTomcatWebServerCustomizer: >> 此处可对tomcat服务器端口被设置为80 >>");
    }
}
