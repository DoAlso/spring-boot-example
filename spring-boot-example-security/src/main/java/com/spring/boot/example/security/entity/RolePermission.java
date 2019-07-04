package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public class RolePermission extends Model<RolePermission> {

private static final long serialVersionUID = 1L;

/**
 * 
 */
		private Long id;

/**
 * 
 */
		    @TableField(value="permission_id")
	private Long permissionId;

/**
 * 
 */
		    @TableField(value="role_id")
	private Long roleId;


		
public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }
		
public Long getPermissionId() {
        return permissionId;
        }

public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
        }
		
public Long getRoleId() {
        return roleId;
        }

public void setRoleId(Long roleId) {
        this.roleId = roleId;
        }

        }
