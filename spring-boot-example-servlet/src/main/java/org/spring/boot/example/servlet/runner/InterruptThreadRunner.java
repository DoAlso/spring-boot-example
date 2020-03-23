package org.spring.boot.example.servlet.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName InterruptThreadRunner
 * @Author huyaxi
 * @DATE 2020/3/16 13:15
 */
@Component
public class InterruptThreadRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("InterruptThreadRunner: " + Thread.currentThread().getName());

    }
}
