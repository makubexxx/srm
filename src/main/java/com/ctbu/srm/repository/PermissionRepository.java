package com.ctbu.srm.repository;

import com.ctbu.srm.entity.domian.Permission;
import com.ctbu.srm.entity.domian.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/9 10:36
 * @Email 308348194@qq.com
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

    List<Permission> findAll();
}
