package org.spring.boot.example.servlet.service;

import org.springframework.boot.web.server.WebServerFactory;

/**
 * MySpringBootFactory的自定义接口
 * @author Administrator
 */
@FunctionalInterface
public interface SpringBootFactoryCustomizer<T extends MySpringBootFactory> {

    /**
     * Customize the specified {@link WebServerFactory}.
     * @param factory the web server factory to customize
     */
    void customize(T factory);
}
