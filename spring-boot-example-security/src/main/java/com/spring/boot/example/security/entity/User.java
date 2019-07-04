package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 配置中心用户表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 用户账户
     */
    @TableField(value = "user_account")
    private String userAccount;

    /**
     * 账户密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 用户姓名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 租户编号
     */
    @TableField(value = "tenant_id")
    private String tenantId;

    /**
     * 性别：1 男，2 女 ，3 未知
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 用户邮箱
     */
    @TableField(value = "user_email")
    private String userEmail;

    /**
     * 用户电话
     */
    @TableField(value = "user_phone")
    private String userPhone;

    /**
     * 用户所属部门
     */
    @TableField(value = "dept_id")
    private Long deptId;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 用户头像
     */
    @TableField(value = "user_head_url")
    private String userHeadUrl;

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
