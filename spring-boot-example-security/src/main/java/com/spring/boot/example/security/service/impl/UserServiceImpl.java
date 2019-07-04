package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.User;
import com.spring.boot.example.security.mapper.UserMapper;
import com.spring.boot.example.security.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配置中心用户表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
