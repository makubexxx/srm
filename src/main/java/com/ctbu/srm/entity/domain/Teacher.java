package com.ctbu.srm.entity.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-11
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_teacher")
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String email;
    @TableField("nick_name")
    private String nickName;
    @TableField("pass_word")
    private String passWord;
    @TableField("reg_time")
    private String regTime;
    @TableField("user_name")
    private String userName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
