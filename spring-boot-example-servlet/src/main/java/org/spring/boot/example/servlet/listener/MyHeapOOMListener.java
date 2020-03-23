package org.spring.boot.example.servlet.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证堆内存溢出
 * @ClassName MyHeapOOMListener
 * @Author huyaxi
 * @DATE 2020/3/18 13:27
 */
@Component
public class MyHeapOOMListener implements ApplicationListener<ApplicationReadyEvent> {

    static class OOMObject {

    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
//        List<OOMObject> list = new ArrayList<>();
//        while (true) {
//            list.add(new OOMObject());
//        }
    }
}
