package org.spring.boot.example.servlet.thread;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MyThreadListener
 * @Author huyaxi
 * @DATE 2020/3/16 10:53
 */
@Order(100)
@Component
public class MyThreadListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("MyThreadListener:>>> Java 线程源码分析研究 ---- Start >>>");
        new Thread(() -> {
            for (;;){
                System.out.println(Thread.currentThread().getName() + ": " +LocalDateTime.now().toString());
                try {
                    TimeUnit.SECONDS.sleep(1);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }) .start();
        Thread thread = new Thread(()-> {
            for (;;){
                System.out.println(Thread.currentThread().getName() + ": 哈哈哈哈哈啊哈哈哈");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        thread.start();
        System.out.println("MyThreadListener:>>> Java 线程源码分析研究 ---- End>>>");
    }
}
