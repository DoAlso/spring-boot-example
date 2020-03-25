package org.spring.boot.example.servlet.listener;

import org.spring.boot.example.servlet.bean.TestReflect;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.*;

/**
 * 该类主要用于验证Class类的各种方法的使用
 *
 * 验证Java反射机制，以及演示Java反射的使用
 *
 * 验证一个对象在JVM的生命周期
 *
 * @ClassName ClassMethodCheckListener
 * @Author huyaxi
 * @DATE 2020/3/19 9:45
 */
@Component
public class JavaReflectCheckListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
//        printFields();
//
//        printMethods();
//
//        testClassLoader();
//
//        try {
//            testReflect();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        testReflectClassStaticMethod();
    }


    private void printFields() {
        Class clazz = this.getClass();
        Field[] fields = clazz.getFields();
        for(Field field : fields){
            int modifiers = field.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " " + "\n");
            //输出变量的类型及变量名
            System.out.println(field.getType().getName()
                    + " " + field.getName() + "\n");
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


    private void testClassLoader() {
        try {
            Class<?> aClass = Class.forName("org.spring.boot.example.servlet.bean.TestReflect");
            Method say = aClass.getDeclaredMethod("say", String.class);
            System.out.println("The Method is : "+say.getName());
            TestReflect testReflect = (TestReflect) aClass.newInstance();
            say.invoke(testReflect,"Spring Boot");
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    /**
     * 验证java反射机制中的静态方法的加载过程
     */
    private void testReflectClassStaticMethod() {
        try {
            Class<?> aClass = Class.forName("org.spring.boot.example.servlet.bean.TestReflect");
            Method[] methods = aClass.getMethods();
            for (Method method : methods){
                int modifiers = method.getModifiers();
                if("public static".equals(Modifier.toString(modifiers))){
                    System.out.print(Modifier.toString(modifiers) + " " + method.getName() + "\n");
                    method.invoke(null,null);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    private void testReflect() throws Exception{
        TestReflect testReflect = new TestReflect();
        Class clazz = testReflect.getClass();
        Method say = clazz.getDeclaredMethod("say", String.class);
        say.invoke(testReflect,"Spring Boot");
    }
}
