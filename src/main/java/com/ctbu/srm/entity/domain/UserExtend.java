package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户扩展信息
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-12
 */
@TableName("tb_user_extend")
public class UserExtend extends Model<UserExtend> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("user_id")
	private String userId;
    /**
     * 未读消息总数
     */
	@TableField("message_count")
	private Integer messageCount;


	public Long getId() {
		return id;
	}

	public UserExtend setId(Long id) {
		this.id = id;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public UserExtend setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public Integer getMessageCount() {
		return messageCount;
	}

	public UserExtend setMessageCount(Integer messageCount) {
		this.messageCount = messageCount;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
