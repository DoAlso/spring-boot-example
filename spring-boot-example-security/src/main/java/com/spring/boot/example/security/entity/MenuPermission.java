package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;

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
    @TableField(value = "menu_id")
    private Long menuId;

    /**
     *
     */
    @TableField(value = "permission_id")
    private Long permissionId;

}
