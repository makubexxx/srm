package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 操作日志表
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@TableName("tb_operation_log")
public class TbOperationLog extends Model<TbOperationLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="operation_log_id", type= IdType.AUTO)
	private Integer operationLogId;
    /**
     * 日志描述
     */
	@TableField("log_description")
	private String logDescription;
    /**
     * 方法参数
     */
	@TableField("action_args")
	private String actionArgs;
    /**
     * 用户主键
     */
	@TableField("user_no")
	private String userNo;
    /**
     * 类名称
     */
	@TableField("class_name")
	private String className;
    /**
     * 方法名称
     */
	@TableField("method_name")
	private String methodName;
	private String ip;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Long createTime;
    /**
     * 模块名称
     */
	@TableField("model_name")
	private String modelName;
    /**
     * 操作
     */
	private String action;
    /**
     * 是否成功 1:成功 2异常
     */
	private Integer succeed;
    /**
     * 异常堆栈信息
     */
	private String message;


	public Integer getOperationLogId() {
		return operationLogId;
	}

	public TbOperationLog setOperationLogId(Integer operationLogId) {
		this.operationLogId = operationLogId;
		return this;
	}

	public String getLogDescription() {
		return logDescription;
	}

	public TbOperationLog setLogDescription(String logDescription) {
		this.logDescription = logDescription;
		return this;
	}

	public String getActionArgs() {
		return actionArgs;
	}

	public TbOperationLog setActionArgs(String actionArgs) {
		this.actionArgs = actionArgs;
		return this;
	}

	public String getUserNo() {
		return userNo;
	}

	public TbOperationLog setUserNo(String userNo) {
		this.userNo = userNo;
		return this;
	}

	public String getClassName() {
		return className;
	}

	public TbOperationLog setClassName(String className) {
		this.className = className;
		return this;
	}

	public String getMethodName() {
		return methodName;
	}

	public TbOperationLog setMethodName(String methodName) {
		this.methodName = methodName;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public TbOperationLog setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public TbOperationLog setCreateTime(Long createTime) {
		this.createTime = createTime;
		return this;
	}

	public String getModelName() {
		return modelName;
	}

	public TbOperationLog setModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	public String getAction() {
		return action;
	}

	public TbOperationLog setAction(String action) {
		this.action = action;
		return this;
	}

	public Integer getSucceed() {
		return succeed;
	}

	public TbOperationLog setSucceed(Integer succeed) {
		this.succeed = succeed;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public TbOperationLog setMessage(String message) {
		this.message = message;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.operationLogId;
	}

}
