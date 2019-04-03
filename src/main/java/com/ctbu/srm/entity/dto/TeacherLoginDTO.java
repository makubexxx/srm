package com.ctbu.srm.entity.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;


/**
 * @Author: Meiziyu
 * @Date: 2019/4/3 15:47
 * @Email 308348194@qq.com
 */
@Data
public class TeacherLoginDTO {

    @NotEmpty(message = "账号不能为空")
    private String account;
    @NotEmpty(message = "密码不能为空")
    private String password;

}
