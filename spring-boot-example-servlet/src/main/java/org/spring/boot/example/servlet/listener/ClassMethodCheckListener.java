package org.spring.boot.example.servlet.listener;

import org.spring.boot.example.servlet.bean.TestReflect;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * 该类主要用于验证Class类的各种方法的使用
 * @ClassName ClassMethodCheckListener
 * @Author huyaxi
 * @DATE 2020/3/19 9:45
 */
@Component
public class ClassMethodCheckListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        printFields();

        printMethods();

        try {
            testReflect();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    private void printFields() {
        Class clazz = this.getClass();
        Field[] fields = clazz.getFields();
        for(Field field : fields){
            int modifiers = field.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //输出变量的类型及变量名
            System.out.println(field.getType().getName()
                    + " " + field.getName());
        }
    }

    private void printMethods() {
        Class clazz = this.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods){
            int modifiers = method.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //获取并输出方法的返回值类型
            Class returnType = method.getReturnType();
            System.out.print(returnType.getName() + " "
                    + method.getName() + "( ");
            //获取并输出方法的所有参数
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter:
                    parameters) {
                System.out.print(parameter.getType().getName()
                        + " " + parameter.getName() + ",");
            }
        }
    }


    private void testReflect() throws Exception{
        TestReflect testReflect = new TestReflect();
        Class clazz = testReflect.getClass();
        Method say = clazz.getDeclaredMethod("say", String.class);
        say.invoke(testReflect,"Spring Boot");
    }
}
