package org.spring.boot.example.servlet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName MySpringBootBeanFactoryAutoConfiguration
 * @Author huyaxi
 * @DATE 2020/3/9 11:53
 */
@Configuration
@Import({MyBeanPostProcessorRegistrar.class})
public class MySpringBootBeanFactoryAutoConfiguration {

    @Bean
    public MySpringBootFactoryTest factoryTest() {
        return new MySpringBootFactoryTest();
    }

}
