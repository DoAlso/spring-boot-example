package com.spring.boot.example.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @ClassName SecurityApplicationTests
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/27 16:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityApplicationTests {

    @Test
    public void contextLoads() {
        String role_admin = String.join(",", "ROLE_ADMIN","ROLE_USER");
        System.out.println(role_admin);
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
