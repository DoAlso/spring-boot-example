package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    /**
     * 角色别名
     */
    @TableField(value = "role_alias")
    private String roleAlias;

    /**
     * 角色状态
     */
    @TableField(value = "role_status")
    private Integer roleStatus;

    /**
     * 租户编号
     */
    @TableField(value = "tenant_id")
    private String tenantId;

    /**
     * 父角色ID
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 创建人
     */
    private Long creater;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    /**
     * 修改人
     */
    private Long updater;

    /**
     * 修改时间
     */
    private LocalDateTime updated;

    /**
     * 删除标志
     */
    private boolean enabled;

}
