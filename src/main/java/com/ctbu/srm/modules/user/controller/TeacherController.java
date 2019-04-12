package com.ctbu.srm.modules.user.controller;

import com.ctbu.srm.base.BaseController;
import com.ctbu.srm.entity.domain.Teacher;
import com.ctbu.srm.modules.user.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/12 11:01
 * @Email 308348194@qq.com
 */
@Controller
@RequestMapping("/api/v1/teacher")
public class TeacherController extends BaseController {

    @Autowired
    ITeacherService iteacherService;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public @ResponseBody
    String teacherInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Teacher> teachers= iteacherService.saveTeacher();
        return toJson(teachers, request, response);
    }

}
