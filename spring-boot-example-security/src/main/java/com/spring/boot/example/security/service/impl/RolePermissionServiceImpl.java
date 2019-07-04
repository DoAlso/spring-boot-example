package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.RolePermission;
import com.spring.boot.example.security.mapper.RolePermissionMapper;
import com.spring.boot.example.security.service.IRolePermissionService;
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
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {
	
}
