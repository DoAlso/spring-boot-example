package com.spring.boot.example.security.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author Huyaxi
 * @since 2019-07-04
 */
@Data
public class Department extends Model<Department> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 部门或机构名称
     */
    @TableField(value = "dept_name")
    private String deptName;

    /**
     * 部门编号
     */
    @TableField(value = "dept_no")
    private String deptNo;

    /**
     * 部门级别深度
     */
    @TableField(value = "dept_level")
    private String deptLevel;

    /**
     * 租户编号
     */
    @TableField(value = "tenant_id")
    private String tenantId;

    /**
     * 父级主键ID
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
