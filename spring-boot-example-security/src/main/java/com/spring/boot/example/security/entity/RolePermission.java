package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class RolePermission extends Model<RolePermission> {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;

    /**
     *
     */
    @TableField(value = "permission_id")
    private Long permissionId;

    /**
     *
     */
    @TableField(value = "role_id")
    private Long roleId;

}
