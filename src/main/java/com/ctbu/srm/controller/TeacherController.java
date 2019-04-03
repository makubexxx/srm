package com.ctbu.srm.controller;

import com.ctbu.srm.annotation.Log;

import com.ctbu.srm.base.BaseController;
import com.ctbu.srm.entity.dto.TeacherLoginDTO;

import com.ctbu.srm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Action;


/**
 * @Author: Meiziyu
 * @Date: 2019/4/3 15:43
 * @Email 308348194@qq.com
 */
@RestController
@RequestMapping("/user/v1/teacher")
public class TeacherController  extends BaseController {

    @Autowired
    TeacherService teacherService;
    @Log("教师端登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    String login(HttpServletRequest request, HttpServletResponse response
            , @RequestBody TeacherLoginDTO teacherLoginDTO) throws Exception{
        teacherService.login(teacherLoginDTO);
        return toJson(teacherLoginDTO,request,response);
    }

}
