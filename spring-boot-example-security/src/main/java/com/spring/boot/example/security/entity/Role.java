package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public class Role extends Model<Role> {

private static final long serialVersionUID = 1L;

/**
 * ID
 */
		private Long id;

/**
 * 角色名称
 */
		    @TableField(value="role_name")
	private String roleName;

/**
 * 角色别名
 */
		    @TableField(value="role_alias")
	private String roleAlias;

/**
 * 角色状态
 */
		    @TableField(value="role_status")
	private Integer roleStatus;

/**
 * 租户编号
 */
		    @TableField(value="tenant_id")
	private String tenantId;

/**
 * 父角色ID
 */
		    @TableField(value="parent_id")
	private Long parentId;

/**
 * 创建人
 */
		private Long creater;

/**
 * 创建时间
 */
		private Date created;

/**
 * 修改人
 */
		private Long updater;

/**
 * 修改时间
 */
		private Date updated;

/**
 * 删除标志
 */
		private Integer enabled;


		
public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }
		
public String getRoleName() {
        return roleName;
        }

public void setRoleName(String roleName) {
        this.roleName = roleName;
        }
		
public String getRoleAlias() {
        return roleAlias;
        }

public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
        }
		
public Integer getRoleStatus() {
        return roleStatus;
        }

public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
        }
		
public String getTenantId() {
        return tenantId;
        }

public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
        }
		
public Long getParentId() {
        return parentId;
        }

public void setParentId(Long parentId) {
        this.parentId = parentId;
        }
		
public Long getCreater() {
        return creater;
        }

public void setCreater(Long creater) {
        this.creater = creater;
        }
		
public Date getCreated() {
        return created;
        }

public void setCreated(Date created) {
        this.created = created;
        }
		
public Long getUpdater() {
        return updater;
        }

public void setUpdater(Long updater) {
        this.updater = updater;
        }
		
public Date getUpdated() {
        return updated;
        }

public void setUpdated(Date updated) {
        this.updated = updated;
        }
		
public Integer getEnabled() {
        return enabled;
        }

public void setEnabled(Integer enabled) {
        this.enabled = enabled;
        }

        }
