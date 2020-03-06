package org.spring.boot.example.servlet.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 自定义SpringBoot监听器
 * @ClassName MyCustomListener
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/13 14:53
 */
@Component
public class MyCustomListener implements ApplicationListener<CustomApplicationEvent> {

    @Override
    public void onApplicationEvent(CustomApplicationEvent customApplicationEvent) {
        System.out.println("This custom event listener");
        customApplicationEvent.printMsg();
    }
}
