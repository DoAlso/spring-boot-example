package org.spring.boot.example.servlet.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationEvent;

/**
 * @ClassName CustomApplicationEvent
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/13 14:37
 */
public class CustomApplicationEvent extends SpringApplicationEvent {

    public CustomApplicationEvent(SpringApplication application, String[] args) {
        super(application, args);
    }

    @Override
    public SpringApplication getSpringApplication() {
        return super.getSpringApplication();
    }
}
