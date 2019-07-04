package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.Permission;
import com.spring.boot.example.security.mapper.PermissionMapper;
import com.spring.boot.example.security.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单按钮表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
	
}
