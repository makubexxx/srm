package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色权限表
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@TableName("role_permission")
public class RolePermission extends Model<RolePermission> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色权限编号
     */
    @TableId("role_permission_id")
	private String rolePermissionId;
    /**
     * 角色编号
     */
	@TableField("role_id")
	private String roleId;
    /**
     * 权限编号
     */
	@TableField("permission_id")
	private String permissionId;
    /**
     * 角色权限状态
     */
	@TableField("role_permission_status")
	private String rolePermissionStatus;


	public String getRolePermissionId() {
		return rolePermissionId;
	}

	public RolePermission setRolePermissionId(String rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
		return this;
	}

	public String getRoleId() {
		return roleId;
	}

	public RolePermission setRoleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getPermissionId() {
		return permissionId;
	}

	public RolePermission setPermissionId(String permissionId) {
		this.permissionId = permissionId;
		return this;
	}

	public String getRolePermissionStatus() {
		return rolePermissionStatus;
	}

	public RolePermission setRolePermissionStatus(String rolePermissionStatus) {
		this.rolePermissionStatus = rolePermissionStatus;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.rolePermissionId;
	}

}
