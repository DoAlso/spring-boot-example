package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class AuthClient extends Model<AuthClient> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 客户端id
     */
    @TableField(value = "client_id")
    private String clientId;

    /**
     * 客户端密钥
     */
    @TableField(value = "client_secret")
    private String clientSecret;

    /**
     * 资源集合
     */
    @TableField(value = "resource_ids")
    private String resourceIds;

    /**
     * 授权范围
     */
    private String scope;

    /**
     * 授权类型
     */
    @TableField(value = "authorozed_grant_types")
    private String authorozedGrantTypes;

    /**
     * 回调地址
     */
    @TableField(value = "web_server_redirect_uri")
    private String webServerRedirectUri;

    /**
     * 权限
     */
    private String authorities;

    /**
     * 令牌过期秒数
     */
    @TableField(value = "access_token_validity")
    private Integer accessTokenValidity;

    /**
     * 刷新令牌过期秒数
     */
    @TableField(value = "refresh_token_validity")
    private Integer refreshTokenValidity;

    /**
     * 附加说明
     */
    @TableField(value = "additional_information")
    private String additionalInformation;

    /**
     * 自动授权
     */
    @TableField(value = "auto_approve")
    private String autoApprove;

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
