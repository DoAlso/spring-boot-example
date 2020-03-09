package org.spring.boot.example.servlet.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.ObjectUtils;

/**
 * @ClassName MyBeanPostProcessorRegistrar
 * @Author huyaxi
 * @DATE 2020/3/9 13:29
 */
public class MyBeanPostProcessorRegistrar implements ImportBeanDefinitionRegistrar, BeanFactoryAware {

    private ConfigurableListableBeanFactory beanFactory;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if (this.beanFactory == null) {
            return;
        }
        registerSyntheticBeanIfMissing(registry, "mySpringBootCustomizerBeanPostProcessor",
                MySpringBootCustomizerBeanPostProcessor.class);
    }


    /**
     * 如果没有则创建一个新的RootBeanDefinition并注册该Bean
     * @param registry
     * @param name
     * @param beanClass
     */
    private void registerSyntheticBeanIfMissing(BeanDefinitionRegistry registry, String name, Class<?> beanClass) {
        if (ObjectUtils.isEmpty(this.beanFactory.getBeanNamesForType(beanClass, true, false))) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(beanClass);
            beanDefinition.setSynthetic(true);
            registry.registerBeanDefinition(name, beanDefinition);
        }
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        if (beanFactory instanceof ConfigurableListableBeanFactory) {
            this.beanFactory = (ConfigurableListableBeanFactory) beanFactory;
        }
    }
}
