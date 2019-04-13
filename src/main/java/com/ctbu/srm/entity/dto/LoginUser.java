package com.ctbu.srm.entity.dto;

import lombok.Data;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/13 11:00
 * @Email 308348194@qq.com
 */
@Data
public class LoginUser {

    /**
     * 用户手机号码
     */
    private String userPhone;

    /**
     * 是否记住密码
     */
    private Boolean remember;
}
