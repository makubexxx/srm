package com.ctbu.srm.modules.user.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ctbu.srm.entity.domain.Teacher;
import com.ctbu.srm.modules.user.mapper.TeacherMapper;
import com.ctbu.srm.modules.user.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-11
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> saveTeacher()
    {
        Teacher teacher = new Teacher();
        teacher.setUserName("meiziyu");
        teacher.setPassWord("meiziyu");
        teacher.setNickName("meiziyu");
        teacher.setEmail("meiziyu@qq.com");
        teacher.setRegTime("2019/4/12");
        Integer result= teacherMapper.insert(teacher);
        return  teacherMapper.selectByName("meiziyu");
    }
}
