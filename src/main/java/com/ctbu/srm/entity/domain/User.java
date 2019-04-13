package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId("user_id")
	private String userId;
    /**
     * 用户名
     */
	@TableField("user_name")
	private String userName;
    /**
     * 用户手机号码

     */
	@TableField("user_phone")
	private String userPhone;
    /**
     * 用户密码
     */
	@TableField("user_password")
	private String userPassword;
    /**
     * 用户最近一次登录时间
     */
	@TableField("user_last_login_time")
	private String userLastLoginTime;
    /**
     * 用户注册时间
     */
	@TableField("user_create_time")
	private String userCreateTime;
    /**
     * 用户状态，0正常，-1删除
     */
	@TableField("user_status")
	private String userStatus;


	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public User setUserPhone(String userPhone) {
		this.userPhone = userPhone;
		return this;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public User setUserPassword(String userPassword) {
		this.userPassword = userPassword;
		return this;
	}

	public String getUserLastLoginTime() {
		return userLastLoginTime;
	}

	public User setUserLastLoginTime(String userLastLoginTime) {
		this.userLastLoginTime = userLastLoginTime;
		return this;
	}

	public String getUserCreateTime() {
		return userCreateTime;
	}

	public User setUserCreateTime(String userCreateTime) {
		this.userCreateTime = userCreateTime;
		return this;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public User setUserStatus(String userStatus) {
		this.userStatus = userStatus;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
