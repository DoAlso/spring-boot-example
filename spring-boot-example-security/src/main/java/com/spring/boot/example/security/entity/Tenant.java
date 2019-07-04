package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class Tenant extends Model<Tenant> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 租户ID
     */
    @TableField(value = "tenant_id")
    private String tenantId;

    /**
     * 租户名称
     */
    @TableField(value = "tenant_name")
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
    private LocalDateTime created;

    /**
     *
     */
    private Long updater;

    /**
     *
     */
    private LocalDateTime updated;

    /**
     *
     */
    private boolean enabled;
}
