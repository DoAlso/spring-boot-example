package com.spring.boot.example.security.mapper;

import com.spring.boot.example.security.entity.AuthClient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Mapper
public interface AuthClientMapper extends BaseMapper<AuthClient> {

}