package org.spring.boot.example.servlet.config;

import org.spring.boot.example.servlet.service.MySpringBootFactory;
import org.spring.boot.example.servlet.service.SpringBootFactoryCustomizer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.util.LambdaSafe;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName MySpringBootCustomizerBeanPostProcessor
 * @Author huyaxi
 * @DATE 2020/3/9 11:13
 */
public class MySpringBootCustomizerBeanPostProcessor implements BeanPostProcessor, BeanFactoryAware {

    private ListableBeanFactory beanFactory;

    private List<SpringBootFactoryCustomizer<?>> customizers;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MySpringBootFactory) {
            //此处利用BeanPostProcessor处理器在已有的MySpringBootFactory类实例化之前，对其进行自定义处理
            postProcessBeforeInitialization((MySpringBootFactory) bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Assert.isInstanceOf(ListableBeanFactory.class, beanFactory,
                "WebServerCustomizerBeanPostProcessor can only be used with a ListableBeanFactory");
        this.beanFactory = (ListableBeanFactory) beanFactory;
    }

    @SuppressWarnings("unchecked")
    private void postProcessBeforeInitialization(MySpringBootFactory mySpringBootFactory) {
        LambdaSafe.callbacks(SpringBootFactoryCustomizer.class, getCustomizers(), mySpringBootFactory)
                .withLogger(MySpringBootCustomizerBeanPostProcessor.class)
                .invoke((customizer) -> customizer.customize(mySpringBootFactory));
    }

    private Collection<SpringBootFactoryCustomizer<?>> getCustomizers() {
        if (this.customizers == null) {
            // Look up does not include the parent context
            this.customizers = new ArrayList<>(getSpringBootFactoryCustomizerBeans());
            this.customizers.sort(AnnotationAwareOrderComparator.INSTANCE);
            this.customizers = Collections.unmodifiableList(this.customizers);
        }
        return this.customizers;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Collection<SpringBootFactoryCustomizer<?>> getSpringBootFactoryCustomizerBeans() {
        return (Collection) this.beanFactory.getBeansOfType(SpringBootFactoryCustomizer.class, false, false).values();
    }
}
