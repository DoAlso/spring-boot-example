package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName MyApplicationStartingEventListener
 * @Author huyaxi
 * @DATE 2020/3/11 16:41
 */
public class MyApplicationContextInitializedEventListener implements ApplicationListener<ApplicationContextInitializedEvent> {


    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent event) {
        System.out.println("MyApplicationContextInitializedEventListener: SpringBoot应用上下文初始化...");
    }
}
