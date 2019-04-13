package com.ctbu.srm.modules.user.controller;


import com.ctbu.srm.base.BaseController;

import com.ctbu.srm.modules.user.service.impl.UserServiceImpl;

import com.ctbu.srm.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Lan
 * @since 2019-04-04
 */
@RestController
@RequestMapping("/api/v1/teacher")
public class UserController extends BaseController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping(value = "/list")
    public ResultUtil list(HttpServletRequest request, HttpServletResponse response) {

        return userService.list();
    }

    @GetMapping("/hello")
    public String hello(HttpServletRequest request,HttpServletResponse response) {
        return toJson("不需要权限也可以访问我啊！",request,response);
    }

}

