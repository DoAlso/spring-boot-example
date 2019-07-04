package com.spring.boot.example.security.service.impl;

import com.spring.boot.example.security.entity.Department;
import com.spring.boot.example.security.mapper.DepartmentMapper;
import com.spring.boot.example.security.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {
	
}
