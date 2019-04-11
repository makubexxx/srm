package com.ctbu.srm.service;

import com.ctbu.srm.base.BaseService;
import com.ctbu.srm.entity.domian.Teacher;
import com.ctbu.srm.entity.dto.TeacherLoginDTO;
import com.ctbu.srm.exception.SrmException;
import com.ctbu.srm.mq.AuditingSender;
import com.ctbu.srm.repository.TeacherRepository;
import com.ctbu.srm.validator.ValidationResult;
import com.ctbu.srm.validator.ValidatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/3 17:02
 * @Email 308348194@qq.com
 */
@Service
public class TeacherService extends BaseService {
    @Autowired
    ValidatorImpl validator;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    AuditingSender auditingSender;

    @Cacheable(value="user-key")
    public   void login(TeacherLoginDTO teacherLoginDTO) throws Exception
    {
        //验证参数完整性
        ValidationResult  validationResult=validator.validate(teacherLoginDTO);
        if (validationResult.isHasError())
        {
            throw new SrmException(validationResult.getErrMsg());
        }
        auditingSender.send();
        Teacher teacher =teacherRepository.findByUserName(teacherLoginDTO.getAccount());



    }
}
