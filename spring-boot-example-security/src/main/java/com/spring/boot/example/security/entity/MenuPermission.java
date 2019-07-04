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
public class MenuPermission extends Model<MenuPermission> {

private static final long serialVersionUID = 1L;

/**
 * 
 */
		private Long id;

/**
 * 
 */
		    @TableField(value="menu_id")
	private Long menuId;

/**
 * 
 */
		    @TableField(value="permission_id")
	private Long permissionId;


		
public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }
		
public Long getMenuId() {
        return menuId;
        }

public void setMenuId(Long menuId) {
        this.menuId = menuId;
        }
		
public Long getPermissionId() {
        return permissionId;
        }

public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
        }

        }
