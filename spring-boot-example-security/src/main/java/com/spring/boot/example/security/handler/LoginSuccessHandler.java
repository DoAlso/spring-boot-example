package com.spring.boot.example.security.handler;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.api.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName LoginSuccessHandler
 * @Author huyaxi
 * @DATE 2019/7/4 10:11
 */
@Slf4j
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        log.info("【LoginSuccessHandler】");
        response.getWriter().write(JSON.toJSONString(R.ok(UUID.randomUUID().toString())));
    }
}
