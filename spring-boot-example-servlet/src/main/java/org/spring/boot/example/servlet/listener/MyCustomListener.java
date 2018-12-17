package org.spring.boot.example.servlet.listener;

import org.springframework.context.ApplicationListener;

/**
 * @ClassName MyCustomListener
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/13 14:53
 */
public class MyCustomListener implements ApplicationListener<CustomApplicationEvent> {

    @Override
    public void onApplicationEvent(CustomApplicationEvent customApplicationEvent) {
        System.out.println("This custom event listener");
    }
}
