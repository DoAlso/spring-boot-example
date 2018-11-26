package org.spring.boot.example.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ServletApplication {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication.run(ServletApplication.class, args);
    }
}
