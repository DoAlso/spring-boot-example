package org.spring.boot.example.servlet.bean;

/**
 * @ClassName TestReflect
 * @Author huyaxi
 * @DATE 2020/3/23 17:48
 */
public class TestReflect {

    public void say(String say){
        System.out.println("TestReflect: say，我被调用了" + say);
    }


    public static void getClassName() {
        System.out.println(TestReflect.class.getName());
    }
}
