package com.spring.boot.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;

/**
 * @ClassName SecurityApplication
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/26 10:31
 */
//@EnableScheduling
@SpringBootApplication
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class,args);
    }


//    @Scheduled(cron="0/2 * * * * ?")
//    public void testCron1(){
//        System.out.println("测试表达式1......");
//    }
//
//
//    @Scheduled(cron="0/2 * * * * ?")
//    public void testCron2(){
//        System.out.println("测试表达式2......");
//    }
}
