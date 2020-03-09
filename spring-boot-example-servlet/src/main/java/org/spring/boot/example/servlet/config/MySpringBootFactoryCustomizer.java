package org.spring.boot.example.servlet.config;

import org.spring.boot.example.servlet.service.MySpringBootFactory;
import org.spring.boot.example.servlet.service.SpringBootFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * @ClassName MySpringBootFactoryTest
 * @Author huyaxi
 * @DATE 2020/3/9 13:08
 */
@Component
public class MySpringBootFactoryCustomizer implements SpringBootFactoryCustomizer {

    @Override
    public void customize(MySpringBootFactory factory) {
        System.out.println("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
    }
}
