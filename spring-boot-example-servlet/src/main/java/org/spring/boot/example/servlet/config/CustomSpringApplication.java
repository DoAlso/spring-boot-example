package org.spring.boot.example.servlet.config;

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
        return builder.run(args);
    }

}
