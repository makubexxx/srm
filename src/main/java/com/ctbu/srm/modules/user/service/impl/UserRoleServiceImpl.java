package com.ctbu.srm.modules.user.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ctbu.srm.entity.domain.UserRole;
import com.ctbu.srm.modules.user.mapper.UserRoleMapper;
import com.ctbu.srm.modules.user.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author Meiziyu
 * @since 2019-04-13
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
	
}
