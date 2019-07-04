package com.spring.boot.example.security.entity;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.List;

/**
 * @ClassName LoginUser
 * @Author huyaxi
 * @DATE 2019/7/4 15:26
 */
@Getter
public class LoginUser extends User {

    private Long id;

    private String realname;

    private String nickname;

    private Integer gender;

    private Long deptId;

    private String avatar;

    private List<Role> roles;

    public LoginUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Long id, String realname, String nickname, Integer gender, Long deptId, String avatar, List<Role> roles) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;
        this.realname = realname;
        this.nickname = nickname;
        this.gender = gender;
        this.deptId = deptId;
        this.avatar = avatar;
        this.roles = roles;
    }
}
