package com.spring.boot.example.security.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.spring.boot.example.security.entity.LoginUser;
import com.spring.boot.example.security.entity.Role;
import com.spring.boot.example.security.entity.User;
import com.spring.boot.example.security.entity.UserRole;
import com.spring.boot.example.security.mapper.RoleMapper;
import com.spring.boot.example.security.mapper.UserMapper;
import com.spring.boot.example.security.mapper.UserRoleMapper;
import com.spring.boot.example.security.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <p>
 * 配置中心用户表  服务实现类
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    private UserMapper userMapper;
    private UserRoleMapper userRoleMapper;
    private RoleMapper roleMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectOne(Wrappers.<User>query().lambda().eq(User::getUserAccount, username));
        if(Objects.isNull(user)){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<UserRole> userRoles = userRoleMapper.selectList(Wrappers.<UserRole>query().lambda().eq(UserRole::getUserId, user.getId()));
        if(userRoles.isEmpty()){
            return new LoginUser(user.getUserAccount(),user.getUserPassword(), true,true,
                    true,true, Collections.emptyList(),user.getId(),
                    user.getUserName(),user.getNickName(),user.getGender(),user.getDeptId(),user.getUserHeadUrl(),
                    Collections.emptyList());
        }
        List<Long> roleIds = userRoles.stream().map(UserRole::getId).collect(Collectors.toList());
        List<Role> roles = roleMapper.selectBatchIds(roleIds);
        List<String> roleAlias = roles.stream().map(Role::getRoleAlias).collect(Collectors.toList());
        return new LoginUser(user.getUserAccount(),user.getUserPassword(),
                true,true, true,true,
                AuthorityUtils.commaSeparatedStringToAuthorityList(String.join(",", roleAlias)),user.getId(),
                user.getUserName(),user.getNickName(),user.getGender(),user.getDeptId(),user.getUserHeadUrl(),
                roles);
    }
}
