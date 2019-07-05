package org.spring.boot.example.servlet.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;

/**
 *
 * Bean声明周期方法回调
 * @ClassName AppConfig
 * @Author huyaxi
 * @DATE 2019/7/5 16:21
 */
public class AppConfig implements InitializingBean, DisposableBean, Lifecycle {
    private InitConfig initConfig;

    public void init(){
        System.out.println("AppConfig开始初始化......");
    }

    public InitConfig getInitConfig() {
        return initConfig;
    }

    public void setInitConfig(InitConfig initConfig) {
        this.initConfig = initConfig;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean销毁时调用......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("所有属性设置完成之后调用......");
    }

    @Override
    public void start() {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    @Override
    public void stop() {
        System.out.println("###############################");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
