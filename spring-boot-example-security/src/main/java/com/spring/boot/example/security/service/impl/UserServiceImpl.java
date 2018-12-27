package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.dao.UserMapper;
import com.spring.boot.example.security.model.SystemUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/12/27 15:05
 */
@Service
public class UserServiceImpl implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        SystemUser user = userMapper.selectUserByAccount(account);
        if(user == null){
            throw new UsernameNotFoundException(String.format("没有该用户 '%s'.", account));
        }
        return user;
    }
}
