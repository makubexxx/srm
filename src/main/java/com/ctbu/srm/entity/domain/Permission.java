package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
public class Permission extends Model<Permission> {

    private static final long serialVersionUID = 1L;

    /**
     * 权限编号
     */
    @TableId("permission_id")
	private String permissionId;
    /**
     * 授权url
     */
	@TableField("permission_url")
	private String permissionUrl;
    /**
     * 描述
     */
	@TableField("permission_comment")
	private String permissionComment;
    /**
     * 权限状态,0正常，-1删除
     */
	@TableField("permission_status")
	private String permissionStatus;


	public String getPermissionId() {
		return permissionId;
	}

	public Permission setPermissionId(String permissionId) {
		this.permissionId = permissionId;
		return this;
	}

	public String getPermissionUrl() {
		return permissionUrl;
	}

	public Permission setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
		return this;
	}

	public String getPermissionComment() {
		return permissionComment;
	}

	public Permission setPermissionComment(String permissionComment) {
		this.permissionComment = permissionComment;
		return this;
	}

	public String getPermissionStatus() {
		return permissionStatus;
	}

	public Permission setPermissionStatus(String permissionStatus) {
		this.permissionStatus = permissionStatus;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.permissionId;
	}

}
