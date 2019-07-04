package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 角色菜单表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public class RoleMenu extends Model<RoleMenu> {

private static final long serialVersionUID = 1L;

/**
 * ID
 */
		private Long id;

/**
 * 角色ID
 */
		    @TableField(value="role_id")
	private Long roleId;

/**
 * 菜单ID
 */
		    @TableField(value="menu_id")
	private Long menuId;


		
public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }
		
public Long getRoleId() {
        return roleId;
        }

public void setRoleId(Long roleId) {
        this.roleId = roleId;
        }
		
public Long getMenuId() {
        return menuId;
        }

public void setMenuId(Long menuId) {
        this.menuId = menuId;
        }

        }
