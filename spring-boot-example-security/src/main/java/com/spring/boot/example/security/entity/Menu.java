package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
public class Menu extends Model<Menu> {

private static final long serialVersionUID = 1L;

/**
 * ID
 */
		private Long id;

/**
 * 菜单名称
 */
		    @TableField(value="menu_name")
	private String menuName;

/**
 * 菜单编号
 */
		    @TableField(value="menu_code")
	private String menuCode;

/**
 * 父级菜单ID
 */
		    @TableField(value="parent_id")
	private Long parentId;

/**
 * 菜单icon
 */
		    @TableField(value="menu_icon")
	private String menuIcon;

/**
 * 菜单路由
 */
		    @TableField(value="menu_url")
	private String menuUrl;

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
		
public String getMenuName() {
        return menuName;
        }

public void setMenuName(String menuName) {
        this.menuName = menuName;
        }
		
public String getMenuCode() {
        return menuCode;
        }

public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
        }
		
public Long getParentId() {
        return parentId;
        }

public void setParentId(Long parentId) {
        this.parentId = parentId;
        }
		
public String getMenuIcon() {
        return menuIcon;
        }

public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
        }
		
public String getMenuUrl() {
        return menuUrl;
        }

public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
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
