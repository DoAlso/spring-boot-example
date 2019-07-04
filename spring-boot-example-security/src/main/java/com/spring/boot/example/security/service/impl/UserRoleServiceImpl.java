package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.UserRole;
import com.spring.boot.example.security.mapper.UserRoleMapper;
import com.spring.boot.example.security.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
	
}
