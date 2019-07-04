package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public class Tenant extends Model<Tenant> {

private static final long serialVersionUID = 1L;

/**
 * 主键
 */
		private Long id;

/**
 * 租户ID
 */
		    @TableField(value="tenant_id")
	private String tenantId;

/**
 * 租户名称
 */
		    @TableField(value="tenant_name")
	private String tenantName;

/**
 * 联系人
 */
		private String linkman;

/**
 * 联系电话
 */
		private String phone;

/**
 * 地址
 */
		private String address;

/**
 * 
 */
		private Long creater;

/**
 * 
 */
		private Date created;

/**
 * 
 */
		private Long updater;

/**
 * 
 */
		private Date updated;

/**
 * 
 */
		private Integer enabled;


		
public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }
		
public String getTenantId() {
        return tenantId;
        }

public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
        }
		
public String getTenantName() {
        return tenantName;
        }

public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
        }
		
public String getLinkman() {
        return linkman;
        }

public void setLinkman(String linkman) {
        this.linkman = linkman;
        }
		
public String getPhone() {
        return phone;
        }

public void setPhone(String phone) {
        this.phone = phone;
        }
		
public String getAddress() {
        return address;
        }

public void setAddress(String address) {
        this.address = address;
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
