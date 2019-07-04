package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public class Department extends Model<Department> {

private static final long serialVersionUID = 1L;

/**
 * ID
 */
		private Long id;

/**
 * 部门或机构名称
 */
		    @TableField(value="dept_name")
	private String deptName;

/**
 * 部门编号
 */
		    @TableField(value="dept_no")
	private String deptNo;

/**
 * 部门级别深度
 */
		    @TableField(value="dept_level")
	private String deptLevel;

/**
 * 租户编号
 */
		    @TableField(value="tenant_id")
	private String tenantId;

/**
 * 父级主键ID
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
		
public String getDeptName() {
        return deptName;
        }

public void setDeptName(String deptName) {
        this.deptName = deptName;
        }
		
public String getDeptNo() {
        return deptNo;
        }

public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
        }
		
public String getDeptLevel() {
        return deptLevel;
        }

public void setDeptLevel(String deptLevel) {
        this.deptLevel = deptLevel;
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
