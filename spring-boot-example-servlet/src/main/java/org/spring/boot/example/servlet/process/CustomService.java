package org.spring.boot.example.servlet.process;

import java.lang.annotation.*;

/**
 * @author Administrator
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface CustomService {
    Class<?>[] value();
}
