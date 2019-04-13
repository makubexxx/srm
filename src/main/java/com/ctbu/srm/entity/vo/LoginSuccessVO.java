package com.ctbu.srm.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/13 10:20
 * @Email 308348194@qq.com
 */
@Data
public class LoginSuccessVO {

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户手机号码
     */
    private String userPhone;

    /**
     * 角色信息
     */
    private List<String> roles;

    /**
     * 用户名
     */
    private String name;


}
