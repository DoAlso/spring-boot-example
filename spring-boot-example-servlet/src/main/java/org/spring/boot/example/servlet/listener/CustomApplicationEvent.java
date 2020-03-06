package org.spring.boot.example.servlet.listener;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义SpringBoot事件
 * @ClassName CustomApplicationEvent
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/13 14:37
 */
public class CustomApplicationEvent extends ApplicationEvent {

    private String msg;

    /**
     * 在自定义事件的构造方法中除了第一个source参数，其他参数都可以去自定义，
     * 可以根据项目实际情况进行监听传参，这里就只定义个简单的String字符串的透传
     * @param source
     * @param msg
     */
    public CustomApplicationEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    /**
     * 自定义监听器触发的透传打印方法
     */
    public void printMsg()
    {
        System.out.println("编程事件监听:" + msg);
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
