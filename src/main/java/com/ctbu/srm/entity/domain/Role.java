package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编号
     */
    @TableId("role_id")
	private String roleId;
    /**
     * 角色名称
     */
	@TableField("role_name")
	private String roleName;
    /**
     * 角色状态，0正常，-1删除
     */
	@TableField("role_status")
	private String roleStatus;


	public String getRoleId() {
		return roleId;
	}

	public Role setRoleId(String roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getRoleName() {
		return roleName;
	}

	public Role setRoleName(String roleName) {
		this.roleName = roleName;
		return this;
	}

	public String getRoleStatus() {
		return roleStatus;
	}

	public Role setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.roleId;
	}

}
