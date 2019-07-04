package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.MenuPermission;
import com.spring.boot.example.security.mapper.MenuPermissionMapper;
import com.spring.boot.example.security.service.IMenuPermissionService;
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
public class MenuPermissionServiceImpl extends ServiceImpl<MenuPermissionMapper, MenuPermission> implements IMenuPermissionService {
	
}
