package org.spring.boot.example.servlet.bean;

import org.spring.boot.example.servlet.listener.CustomApplicationEvent;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 研究Bean生命周期
 * Bean生命周期方法回调
 * @ClassName AppConfig
 * @Author huyaxi
 * @DATE 2019/7/5 16:21
 */
public class AppConfig implements InitializingBean, DisposableBean, Lifecycle {

    private final ApplicationContext applicationContext;


    private InitConfig initConfig;

    public AppConfig(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
        System.out.println("AppConfig: 开始创建类的实例......");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("AppConfig：postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AppConfig：所有属性设置完成之后调用......");
    }

    public void init(){
        System.out.println("AppConfig：AppConfig开始初始化......");
        applicationContext.publishEvent(new CustomApplicationEvent(this,"哈哈哈哈"));
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("AppConfig: preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("AppConfig：Bean销毁时调用......");
    }

    @Override
    public void start() {
        System.out.println("AppConfig：&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    @Override
    public void stop() {
        System.out.println("AppConfig：###############################");
    }

    @Override
    public boolean isRunning() {
        return false;
    }


    public InitConfig getInitConfig() {
        return initConfig;
    }


    public void setInitConfig(InitConfig initConfig) {
        this.initConfig = initConfig;
    }
}
