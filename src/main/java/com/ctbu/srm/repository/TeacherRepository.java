package com.ctbu.srm.repository;

import com.ctbu.srm.entity.domian.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/3 19:26
 * @Email 308348194@qq.com
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByUserName(String userName);
    Teacher findByUserNameOrEmail(String username, String email);
}