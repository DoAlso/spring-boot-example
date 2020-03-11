package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName MyApplicationStartingEventListener
 * @Author huyaxi
 * @DATE 2020/3/11 16:41
 */
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {


    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("MyApplicationPreparedEventListener: SpringBoot应用上下文载入...");
    }
}
