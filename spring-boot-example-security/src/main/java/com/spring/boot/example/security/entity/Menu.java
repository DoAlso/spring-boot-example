package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 菜单名称
     */
    @TableField(value = "menu_name")
    private String menuName;

    /**
     * 菜单编号
     */
    @TableField(value = "menu_code")
    private String menuCode;

    /**
     * 父级菜单ID
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 菜单icon
     */
    @TableField(value = "menu_icon")
    private String menuIcon;

    /**
     * 菜单路由
     */
    @TableField(value = "menu_url")
    private String menuUrl;

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
