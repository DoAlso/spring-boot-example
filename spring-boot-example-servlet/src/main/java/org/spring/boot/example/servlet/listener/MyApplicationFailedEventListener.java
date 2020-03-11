package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyApplicationFailedEventListener
 * @Author huyaxi
 * @DATE 2020/3/11 16:51
 */
@Component
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        System.out.println("MyApplicationFailedEventListener: SpringBoot应用启动失败...");
    }
}
