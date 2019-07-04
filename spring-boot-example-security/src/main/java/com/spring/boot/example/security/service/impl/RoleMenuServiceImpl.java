package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.RoleMenu;
import com.spring.boot.example.security.mapper.RoleMenuMapper;
import com.spring.boot.example.security.service.IRoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色菜单表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {
	
}
