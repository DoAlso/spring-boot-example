package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName MyListener
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/13 13:54
 */
public class MyListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
   public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("SpringBoot事件机制...");
    }
}
