package com.ctbu.srm.entity.dto;

import lombok.Data;

@Data
public class LoginForm extends LoginUser {

    /**
     * 用户密码
     */
    private String userPassword;

}