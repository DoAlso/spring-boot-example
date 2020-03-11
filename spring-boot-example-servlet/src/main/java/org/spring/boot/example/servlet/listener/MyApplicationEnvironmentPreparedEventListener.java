package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName MyApplicationStartingEventListener
 * @Author huyaxi
 * @DATE 2020/3/11 16:41
 */
public class MyApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {


    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("MyApplicationEnvironmentPreparedEventListener: SpringBoot准备应用环境...");
    }
}
