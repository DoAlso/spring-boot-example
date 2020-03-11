package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName MyApplicationStartingEventListener
 * @Author huyaxi
 * @DATE 2020/3/11 16:41
 */
public class MyApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("MyApplicationStartingEventListener: SpringBoot准备启动...");
    }
}
