package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 菜单按钮表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class Permission extends Model<Permission> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 操作名称
     */
    @TableField(value = "permission_name")
    private String permissionName;

    /**
     * 操作类型
     */
    @TableField(value = "permission_method")
    private Integer permissionMethod;

    /**
     * 操作地址
     */
    @TableField(value = "permission_url")
    private String permissionUrl;

    /**
     * 微服务访问前缀
     */
    @TableField(value = "server_prefix")
    private String serverPrefix;

    /**
     * 网关访问前缀
     */
    @TableField(value = "gateway_prefix")
    private String gatewayPrefix;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private LocalDateTime updated;

    /**
     * 删除标志
     */
    private boolean enabled;
}
