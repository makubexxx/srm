package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@TableName("user_role")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户角色编号
     */
    @TableId("user_role_id")
	private String userRoleId;
    /**
     * 用户编号
     */
	@TableField("user_id")
	private String userId;
    /**
     * 角色编号
     */
	@TableField("role_id")
	private String roleId;
    /**
     * 用户角色状态，0正常，-1删除
     */
	@TableField("user_role_status")
	private String userRoleStatus;


	public String getUserRoleId() {
		return userRoleId;
	}

	public UserRole setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public UserRole setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getRoleId() {
		return roleId;
	}

	public UserRole setRoleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getUserRoleStatus() {
		return userRoleStatus;
	}

	public UserRole setUserRoleStatus(String userRoleStatus) {
		this.userRoleStatus = userRoleStatus;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.userRoleId;
	}

}
