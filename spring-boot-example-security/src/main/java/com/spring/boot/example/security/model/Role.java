package com.spring.boot.example.security.model;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_name
     *
     * @mbg.generated
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_key
     *
     * @mbg.generated
     */
    private String roleKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role_sort
     *
     * @mbg.generated
     */
    private Integer roleSort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.data_scope
     *
     * @mbg.generated
     */
    private String dataScope;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.del_flag
     *
     * @mbg.generated
     */
    private String delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_id
     *
     * @return the value of role.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_id
     *
     * @param roleId the value for role.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_name
     *
     * @return the value of role.role_name
     *
     * @mbg.generated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_name
     *
     * @param roleName the value for role.role_name
     *
     * @mbg.generated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_key
     *
     * @return the value of role.role_key
     *
     * @mbg.generated
     */
    public String getRoleKey() {
        return roleKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_key
     *
     * @param roleKey the value for role.role_key
     *
     * @mbg.generated
     */
    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey == null ? null : roleKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.role_sort
     *
     * @return the value of role.role_sort
     *
     * @mbg.generated
     */
    public Integer getRoleSort() {
        return roleSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.role_sort
     *
     * @param roleSort the value for role.role_sort
     *
     * @mbg.generated
     */
    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.data_scope
     *
     * @return the value of role.data_scope
     *
     * @mbg.generated
     */
    public String getDataScope() {
        return dataScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.data_scope
     *
     * @param dataScope the value for role.data_scope
     *
     * @mbg.generated
     */
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope == null ? null : dataScope.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.status
     *
     * @return the value of role.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.status
     *
     * @param status the value for role.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.del_flag
     *
     * @return the value of role.del_flag
     *
     * @mbg.generated
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.del_flag
     *
     * @param delFlag the value for role.del_flag
     *
     * @mbg.generated
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.create_by
     *
     * @return the value of role.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.create_by
     *
     * @param createBy the value for role.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.create_time
     *
     * @return the value of role.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.create_time
     *
     * @param createTime the value for role.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.update_by
     *
     * @return the value of role.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.update_by
     *
     * @param updateBy the value for role.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.update_time
     *
     * @return the value of role.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.update_time
     *
     * @param updateTime the value for role.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.remark
     *
     * @return the value of role.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.remark
     *
     * @param remark the value for role.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Role other = (Role) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleKey() == null ? other.getRoleKey() == null : this.getRoleKey().equals(other.getRoleKey()))
            && (this.getRoleSort() == null ? other.getRoleSort() == null : this.getRoleSort().equals(other.getRoleSort()))
            && (this.getDataScope() == null ? other.getDataScope() == null : this.getDataScope().equals(other.getDataScope()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleKey() == null) ? 0 : getRoleKey().hashCode());
        result = prime * result + ((getRoleSort() == null) ? 0 : getRoleSort().hashCode());
        result = prime * result + ((getDataScope() == null) ? 0 : getDataScope().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleKey=").append(roleKey);
        sb.append(", roleSort=").append(roleSort);
        sb.append(", dataScope=").append(dataScope);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}