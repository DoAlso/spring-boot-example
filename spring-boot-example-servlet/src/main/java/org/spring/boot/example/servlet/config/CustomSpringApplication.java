package org.spring.boot.example.servlet.config;

import org.spring.boot.example.servlet.listener.MyApplicationContextInitializedEventListener;
import org.spring.boot.example.servlet.listener.MyApplicationEnvironmentPreparedEventListener;
import org.spring.boot.example.servlet.listener.MyApplicationPreparedEventListener;
import org.spring.boot.example.servlet.listener.MyApplicationStartingEventListener;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @ClassName CustomSpringApplication
 * @Author huyaxi
 * @DATE 2020/3/6 11:49
 */
public class CustomSpringApplication {

    public static ConfigurableApplicationContext run(Class source,String... args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(source);
        List<LauncherService> launcherList = new ArrayList<>();
        ServiceLoader.load(LauncherService.class).forEach(launcherList::add);
        launcherList.forEach(LauncherService::launcher);
        // 添加SpringBoot启动事件监听器
        builder.listeners(new MyApplicationStartingEventListener(),
                new MyApplicationEnvironmentPreparedEventListener(),
                new MyApplicationContextInitializedEventListener(),
                new MyApplicationPreparedEventListener());
        return builder.run(args);
    }

}
