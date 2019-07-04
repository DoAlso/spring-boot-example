package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.Role;
import com.spring.boot.example.security.mapper.RoleMapper;
import com.spring.boot.example.security.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	
}
