package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyListener
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/13 13:54
 */
@Component
public class MyApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {


    @Override
   public void onApplicationEvent(ApplicationReadyEvent applicationStartedEvent) {
        System.out.println("MyApplicationReadyEventListener: SpringBoot的应用启动完成，开始运行...");
    }
}
