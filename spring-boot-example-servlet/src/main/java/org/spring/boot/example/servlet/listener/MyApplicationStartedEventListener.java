package org.spring.boot.example.servlet.listener;

import org.spring.boot.example.servlet.ServletApplication;
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
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    private final ServletApplication.ApplicationConfig config;

    public MyApplicationStartedEventListener(ServletApplication.ApplicationConfig config) {
        this.config = config;
    }

    @Override
   public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("MyApplicationStartedEventListener: SpringBoot的应用上下文载入完毕...");
        config.app();
        config.annotations();
    }
}
