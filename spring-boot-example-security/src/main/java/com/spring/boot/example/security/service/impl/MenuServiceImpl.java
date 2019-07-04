package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.Menu;
import com.spring.boot.example.security.mapper.MenuMapper;
import com.spring.boot.example.security.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
	
}
