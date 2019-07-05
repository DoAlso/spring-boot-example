package org.spring.boot.example.servlet.listener;

import org.spring.boot.example.servlet.ServletApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyListener
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/13 13:54
 */
@Component
public class MyListener implements ApplicationListener<ApplicationStartedEvent> {

    @Autowired
    private ServletApplication.ApplicationConfig config;

    @Override
   public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("SpringBoot事件机制...");
        config.app();
    }
}
