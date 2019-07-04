package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 菜单按钮表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public class Permission extends Model<Permission> {

private static final long serialVersionUID = 1L;

/**
 * ID
 */
		private Long id;

/**
 * 操作名称
 */
		    @TableField(value="permission_name")
	private String permissionName;

/**
 * 操作类型
 */
		    @TableField(value="permission_method")
	private Integer permissionMethod;

/**
 * 操作地址
 */
		    @TableField(value="permission_url")
	private String permissionUrl;

/**
 * 微服务访问前缀
 */
		    @TableField(value="server_prefix")
	private String serverPrefix;

/**
 * 网关访问前缀
 */
		    @TableField(value="gateway_prefix")
	private String gatewayPrefix;

/**
 * 创建人
 */
		private String creater;

/**
 * 创建时间
 */
		private Long created;

/**
 * 修改人
 */
		private String updater;

/**
 * 修改时间
 */
		private Long updated;

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
		
public String getPermissionName() {
        return permissionName;
        }

public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
        }
		
public Integer getPermissionMethod() {
        return permissionMethod;
        }

public void setPermissionMethod(Integer permissionMethod) {
        this.permissionMethod = permissionMethod;
        }
		
public String getPermissionUrl() {
        return permissionUrl;
        }

public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
        }
		
public String getServerPrefix() {
        return serverPrefix;
        }

public void setServerPrefix(String serverPrefix) {
        this.serverPrefix = serverPrefix;
        }
		
public String getGatewayPrefix() {
        return gatewayPrefix;
        }

public void setGatewayPrefix(String gatewayPrefix) {
        this.gatewayPrefix = gatewayPrefix;
        }
		
public String getCreater() {
        return creater;
        }

public void setCreater(String creater) {
        this.creater = creater;
        }
		
public Long getCreated() {
        return created;
        }

public void setCreated(Long created) {
        this.created = created;
        }
		
public String getUpdater() {
        return updater;
        }

public void setUpdater(String updater) {
        this.updater = updater;
        }
		
public Long getUpdated() {
        return updated;
        }

public void setUpdated(Long updated) {
        this.updated = updated;
        }
		
public Integer getEnabled() {
        return enabled;
        }

public void setEnabled(Integer enabled) {
        this.enabled = enabled;
        }

        }
