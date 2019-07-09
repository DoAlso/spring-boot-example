package com.spring.boot.example.security.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 配置中心用户表  前端控制器
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
