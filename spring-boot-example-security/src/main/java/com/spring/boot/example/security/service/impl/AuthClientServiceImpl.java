package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.AuthClient;
import com.spring.boot.example.security.mapper.AuthClientMapper;
import com.spring.boot.example.security.service.IAuthClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *   服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class AuthClientServiceImpl extends ServiceImpl<AuthClientMapper, AuthClient> implements IAuthClientService {
	
}
