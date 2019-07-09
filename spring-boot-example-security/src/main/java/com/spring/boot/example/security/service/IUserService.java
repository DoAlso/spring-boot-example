package com.spring.boot.example.security.service;

import com.spring.boot.example.security.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public interface IUserService extends IService<User>, UserDetailsService {
	
}
