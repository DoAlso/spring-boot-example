package com.spring.boot.example.security;

import com.spring.boot.example.security.utils.FastJsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName SecurityApplicationTests
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/27 16:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityApplicationTests {

    @Resource
    private UserDetailsService userDetailsService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getSystemUserByAccount(){
        UserDetails userDetails = userDetailsService.loadUserByUsername("admin");
        System.out.println(FastJsonUtil.toJSONString(userDetails));
    }
}
