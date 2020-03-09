package org.spring.boot.example.servlet.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 容器启动之前的Environment自定义处理器
 * @ClassName CustomEnvironmentPostProcessor
 * @Author huyaxi
 * @DATE 2020/3/9 10:52
 */
public class CustomEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.out.println("CustomEnvironmentPostProcessor: >> 自定义环境处理器,可以参考DevToolsPropertyDefaultsPostProcessor的实现 >>");
    }
}
