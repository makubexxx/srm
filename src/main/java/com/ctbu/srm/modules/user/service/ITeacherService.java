package com.ctbu.srm.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.ctbu.srm.entity.domain.Teacher;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-11
 */
public interface ITeacherService extends IService<Teacher> {

    List<Teacher> saveTeacher();
}
