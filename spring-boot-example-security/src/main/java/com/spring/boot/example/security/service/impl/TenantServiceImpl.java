package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.Tenant;
import com.spring.boot.example.security.mapper.TenantMapper;
import com.spring.boot.example.security.service.ITenantService;
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
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements ITenantService {
	
}
